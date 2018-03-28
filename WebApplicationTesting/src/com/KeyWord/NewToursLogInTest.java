package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest 

{
	//FirefoxDriver driver ;
	ChromeDriver driver;
	//EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "c:\\edgedriver.exe");
		
		//driver  = new EdgeDriver();
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn() throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\udaya\\Desktop\\SeleniumTesting\\WebApplicationTesting\\NewToursLogIn.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.xpath(pr.getProperty("LogIn"))).click();
		
		String ExpectedTitle="Find";
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("User Successfully Logged In  -- PASS");
		}
		else
		{
			System.out.println("User Failed to LogIn -- FAIL");
		}
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
