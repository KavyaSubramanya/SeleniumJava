package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	private String pageUrl="http://the-internet.herokuapp.com/";
	private By formAuthLocator=By.xpath("//a[contains(text(),'Form Authentication')]");
	
	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	//open Welcomepage
	public void openpage()
	{
		log.info("Opening Homepage");
		openURL(pageUrl);
		log.info("Page opened");
	}
	
	public LoginPage ClickFormAuth() {
		log.info("Click Form Authentication");
		click(formAuthLocator);
		return new LoginPage(driver,log);
	}

}
