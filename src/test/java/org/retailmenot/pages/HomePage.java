package org.retailmenot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.retailmenot.util.AppLibrary;

public class HomePage {
	
	WebDriver driver;
	
	//Performing a activity goes to next page
	public ProductDealsPage browseProductDeals()
	{
		
		//driver.findElement(By.linkText("Coupons")).click();

		driver.findElement(By.linkText(AppLibrary.pro.getProperty("retailmenot.homepage.coupons"))).click();
		driver.findElement(By.linkText(AppLibrary.pro.getProperty("retailmenot.homepage.deals"))).click();
		return new ProductDealsPage();
		
		
//		//return next page object..
//		HomePage hPage = new HomePage();
//		return hPage;
		//return this;
		
	}
//	public HomePage searchByItemName(String itemName)
//	{
//		
//	}

}
