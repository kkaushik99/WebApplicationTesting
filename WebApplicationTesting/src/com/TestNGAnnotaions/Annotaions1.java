package com.TestNGAnnotaions;

import org.testng.annotations.Test;

public class Annotaions1 
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This will launch Firefox Browser");
	}
	
	@Test(priority=2)
	public void LogIN()
	{
		System.out.println("Testing LogIn Functionality");
	}
	
	@Test(enabled=false)
	public void InBox()
	{
		System.out.println("Testing InBox Functionality");
	}
	
	@Test(priority=3)
	public void ComposeMail()
	{
		System.out.println("Testing Compose Mail Functionality");
	}
}
