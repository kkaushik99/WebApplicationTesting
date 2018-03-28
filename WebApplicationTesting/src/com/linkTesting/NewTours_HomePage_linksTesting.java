package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_linksTesting {

	public static void main(String[] args)
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int a=0;a<links.size();a++)
		{
			System.out.println(a+"  "+links.get(a).getText());
			
			links.get(a).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			
			driver.navigate().back();
			
			
			// recreating arrayList .. since the elements in the array is cleared when click operation is done on the Index of an Array
			links=driver.findElements(By.tagName("a"));
						
		}
		
		driver.close();


	}

}
