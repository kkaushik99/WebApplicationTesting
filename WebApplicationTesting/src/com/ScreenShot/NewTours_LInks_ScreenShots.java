package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewTours_LInks_ScreenShots
{
	public static void main(String []args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int a=0;a<links.size();a++)
		{
			
			String linkName=links.get(a).getText();
			System.out.println(a+"  "+links.get(a).getText());
			
			links.get(a).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			Sleeper.sleepTightInSeconds(5);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\udaya\\Desktop\\SeleniumTesting\\WebApplicationTesting\\ScreenShots\\"+linkName+".png"));
			
			
			driver.navigate().back();
			
			
			// recreating arrayList .. since the elements in the array is cleared when click operation is done on the Index of an Array
			links=driver.findElements(By.tagName("a"));
						
		}
		
		driver.close();


	}

}


