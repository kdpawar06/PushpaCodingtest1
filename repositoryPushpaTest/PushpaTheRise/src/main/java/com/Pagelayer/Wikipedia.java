package com.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baselayer.Baseclass;

public class Wikipedia extends Baseclass {

	@FindBy(xpath = "//input[@name='search']")
	WebElement search;

	@FindBy(xpath = "//input[@id='searchButton']")
	WebElement searchbtton;

	@FindBy(xpath = "//a[@title='Pushpa: The Rise']")
	WebElement clickpushpa;

	@FindBy(xpath = "(//td[@class='infobox-data'])[10]")
	WebElement releasedate;

	@FindBy(xpath = "(//td[@class='infobox-data'])[12]")
	WebElement country;

	public Wikipedia() {
		PageFactory.initElements(driver, this);
	}

	public void validatePushpatherise(String searchvalue) {
		search.sendKeys(searchvalue);
	}

	public void clickonserchbutton() {
		searchbtton.click();
	}

	public void clickonpushpariselink() {
		clickpushpa.click();
	}

	public String capturerelesedateofpushpa() {
		return releasedate.getText();
	}

	public String capturecountryname() {
		return country.getText();
	}
}
