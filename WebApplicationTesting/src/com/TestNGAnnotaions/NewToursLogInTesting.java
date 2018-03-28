package com.TestNGAnnotaions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTesting 
{
	FirefoxDriver driver;
	
	@BeforeTest()
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogInTest()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElementByName("login").click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	String ExpectedTItle="Find a Flight: Mercury Tours:";
	String ActualTitle=driver.getTitle();
	
	if(ActualTitle.equals(ExpectedTItle))
	{
		System.out.println("Title Matched -- PASS");
	}
		
	else
	{
		System.out.println("Title Not Matched  -- FAIL");
	}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
