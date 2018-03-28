package com.NewToursApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursLogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
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
		driver.close();
		

	}

}
