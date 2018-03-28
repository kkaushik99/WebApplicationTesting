package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserAutomation {

	public static void main(String[] args)
	{
		FirefoxDriver kavithat = new FirefoxDriver();
		kavithat.navigate().to("http://gmail.com");
		kavithat.close();

	}

}
