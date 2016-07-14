package org.retailmenot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDealsPage {
	
	WebDriver driver;
	
	public boolean verifyHeaderText(String expected)
	{
		boolean result=false;
		
		String actual = driver.findElement(By.cssSelector("h1.h1")).getText();
		
		if(actual.equals(expected))
		{
			result = true;
		}
		return result;
	}
	public int getCategoryCount(String categoryName)
	{                                                       //"+ categoryName +"
		driver.findElement(By.xpath("(//a[contains(text()," +     categoryName         +   ")])[2]")).click();
		
		List<WebElement> categoryList = driver.findElements(By.cssSelector("#"+categoryName+">div>div"));
		return categoryList.size();
		
	}

}
