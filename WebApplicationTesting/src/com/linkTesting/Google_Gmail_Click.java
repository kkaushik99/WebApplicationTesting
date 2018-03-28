package com.linkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.close();

	}

}
