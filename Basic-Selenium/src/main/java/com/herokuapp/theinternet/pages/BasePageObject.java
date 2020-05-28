package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
	protected WebDriver driver;
	protected Logger log;

	public BasePageObject(WebDriver driver, Logger log) {
		this.driver=driver;
		this.log=log;
		
	}

	protected void openURL(String pageUrl)
	{
		driver.navigate().to(pageUrl);
		driver.manage().window().maximize();
	}
	
	protected WebElement find(By locator)
	{
		return driver.findElement(locator);
	}
	
	protected void click(By locator)
	{
		waitForvisibility(locator, 5);
		find(locator).click();
	}
	
	protected void type(String text, By locator)
	{
		waitForvisibility(locator, 5);
		find(locator).sendKeys(text);
	}
	
	protected String getContent(By locator)
	{
		waitForvisibility(locator, 5);
		 return find(locator).getText();
	}
	
	protected void waitForvisibility(By locator, long time)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
