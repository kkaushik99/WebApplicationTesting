package com.ValidatingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingIURL_FaceBook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedURL="facebook.com";
		System.out.println(ExpectedURL);
		
		String ActualURL=driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		if(ActualURL.contains(ExpectedURL))
		{
			System.out.println("URL Matched - PASS");
		}
		else
		{
			System.out.println("URL Not Matched - FAIL");
		}

		driver.close();
	}

}
