package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursApplicationLogInTest
{
	
	@Parameters("Browser")
	
	@Test
	public void LogIn(String b) throws MalformedURLException
	{
		
		System.out.println(b);
		
		// Nodes
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		
		else
			if(b.equals("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.122:4444/wd/hub"),cap); // connection to HUb and Node
		
		
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
