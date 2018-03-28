package com.linkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Search_Testing {
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/input[3]"));
		
		driver.close();

	}

}
