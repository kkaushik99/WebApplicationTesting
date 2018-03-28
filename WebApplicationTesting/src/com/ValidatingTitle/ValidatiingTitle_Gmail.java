package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatiingTitle_Gmail {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String ExpectedTitle="Gmail"; // Client Req
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle();// Dev Title
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched - PASS");
		}
		else
		{
			System.out.println("Title not Matched -- FAIL");
		}

		driver.close();
	}

}
