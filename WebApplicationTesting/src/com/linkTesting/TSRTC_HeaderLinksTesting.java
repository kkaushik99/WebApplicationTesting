package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderLinksTesting {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderBlockLinks.size());
		
		
		for(int k=0;k<HeaderBlockLinks.size();k++)
		{
			String HeaderLinkName=HeaderBlockLinks.get(k).getText();
			System.out.println(k+"  "+HeaderLinkName);
			
			HeaderBlockLinks.get(k).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(10);
			
			HeaderBlock=driver.findElement(By.className("menu-wrap"));
			HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
			
		}
		
		driver.close();

	}

}
