package com.Testlayer;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baselayer.Baseclass;
import com.Pagelayer.Wikipedia;

public class Wikipediatest extends Baseclass {
	static Wikipedia searchfilm;

	@BeforeClass
	public void setup() {
		Baseclass.initialization();
	}

	@Test(priority = 1)
	public void searchonwikipedia() {
		searchfilm = new Wikipedia();

		searchfilm.validatePushpatherise("PushpaTheRise");
	}

	@Test(priority = 2)
	public void clickontheserch() {
		// assert.assertEquals("India", "India");
		searchfilm.clickonserchbutton();
	}

	@Test(priority = 3)
	public void clickonpushpalink() {
		searchfilm.clickonpushpariselink();
	}

	@Test(priority = 4)
	public void validatereleasedate() {
		// searchfilm.capturerelesedateofpushpa();
		Assert.assertEquals(searchfilm.capturecountryname().contains("India"), true);
	}

	@Test(priority = 5)
	public void validatcountry() {
		Assert.assertEquals(searchfilm.capturerelesedateofpushpa().contains("17 December 2021"), true);
	}

}
