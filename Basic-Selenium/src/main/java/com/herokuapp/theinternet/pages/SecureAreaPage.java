package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureAreaPage extends BasePageObject {
	
	private By messageLocator=By.xpath("//div[@class='row']/div/div[@id='flash']");
		
	public SecureAreaPage(WebDriver driver, Logger log) {
		super(driver, log);
	}
public void VerifyLogin(String message)
{
	log.info("Verify Log in Message");
	String actual=getContent(messageLocator);
	Assert.assertTrue(actual.contains(message));	
}
}
