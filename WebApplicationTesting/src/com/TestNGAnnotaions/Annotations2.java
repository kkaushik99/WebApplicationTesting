package com.TestNGAnnotaions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
	
	@BeforeTest
	public void BrowserLaunchAndLogIN()
	{
		System.out.println("Browser launch and LogIn");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("Testing INBox Functionality");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("Testing Compose mail Functionality");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("This is used to close the Application ");
	}
	
}
