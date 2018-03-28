package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTest
{

	@Test
	public void HomePageTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.Register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		WMT.Support();
		driver.navigate().back();
		
		WMT.LogInTest("tutorial", "tutorial");
		
		driver.close();
	}
	
	
}
