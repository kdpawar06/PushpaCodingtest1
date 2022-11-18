package com.Pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;

public class Imdb extends Baseclass{
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchmovie;

	@FindBy(xpath = "(//a[@data-testid='search-result--const'])[1]")
	WebElement searchbutton;

	@FindBy(xpath = "//span[text()='Details']")
	WebElement gotodetais;

	@FindBy(xpath = "(//div[@data-testid='title-details-section']//a)[2]")
	WebElement releasedateofmovie;

	@FindBy(xpath = "//button[text()='Country of origin']/following::li[1]")
	WebElement countryname;
	
	public Imdb()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entermoviename(String searchvalue)
	{
		searchmovie.sendKeys(searchvalue);
	}
	public void clickonserchbtn()
	{
		searchbutton.click();
	}
	public void detailsofmovie()
	{
		 JavascriptExecutor js =(JavascriptExecutor)driver;
			
		js.executeScript("arguments[0].scrollIntoView(true);",gotodetais);
	}
	public String capturereleasedate()
	{
		return releasedateofmovie.getText();
	}
	public String capturecountryname()
	{
		return countryname.getText();
	}
}











