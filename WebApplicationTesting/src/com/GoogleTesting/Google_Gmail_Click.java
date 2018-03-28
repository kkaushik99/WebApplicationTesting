package com.GoogleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.className("gb_P")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
