package com.Testlayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.Imdb;
import com.Pagelayer.Wikipedia;

import junit.framework.Assert;

public class Imdbtest extends Baseclass{
	Imdb searchmovie;
	@BeforeClass
	public void setup()
	{
		Baseclass.initialization();
		driver.navigate().to("https:\\www.imdb.com");
	}
	@Test(priority = 1)
	public void searchonimdb() {
	 searchmovie = new Imdb();
     searchmovie.entermoviename("Pushpa:The Rise");
	}
	@Test(priority = 2)
	public void clickonthesearchbtn()
	{
		searchmovie.clickonserchbtn();
	}
	@Test(priority = 3)
	public void scrolldownatdetails()
	{
		searchmovie.detailsofmovie();
	}
	@Test(priority = 4)
	public void validatereleasedate()
	{
		Assert.assertEquals(searchmovie.capturereleasedate().contains("December 17,2021"),true);
	}
	@Test(priority = 5)
	public void validatecountry()
	{
		Assert.assertEquals(searchmovie.capturecountryname().contains("India"),true );
		
	}
}
