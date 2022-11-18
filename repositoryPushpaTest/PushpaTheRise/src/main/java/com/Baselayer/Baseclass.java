package com.Baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static void initialization()
	{
  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDrivers\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();	
	 driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org");
		
}
}