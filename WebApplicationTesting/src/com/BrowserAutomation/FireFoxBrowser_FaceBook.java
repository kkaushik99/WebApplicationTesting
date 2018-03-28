package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_FaceBook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.navigate().to("http://google.com");
		
		driver.close();

	}

}
