package com.TestNGAnnotaions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 
{

	@BeforeMethod
	public void BrowserLaunch()
	{
		System.out.println("Browser launch ");
	}
	
	@Test(priority=1)
	public void LogIn()
	{
		System.out.println("Testing LogIN Functionality");
	}
	
	@Test(priority=2)
	public void InBox()
	{
		System.out.println("Testing INBox Functionality");
	}
	
	@Test(priority=3)
	public void ComposeMail()
	{
		System.out.println("Testing Compose mail Functionality");
	}
	
	@Test(priority=4)
	public void SentMail()
	{
		System.out.println("Testing SentMail Functionality");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("This is used to close the Application ");
	}
}
