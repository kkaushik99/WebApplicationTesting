package com.linkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Support_BackToHome {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//driver.findElement(By.linkText("SUPPORT")).click();
		//driver.findElementByLinkText("SUPPORT").click();
		
		WebElement kavitha=driver.findElementByLinkText("SUPPORT");
		kavitha.click();
		
		// BackToHome Element
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		driver.close();		

	}

}
