package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {
	
	private By usernameLocator=By.name("username");
	private By passwordLocator=By.name("password");
	private By loginbtnLocator=By.xpath("//button[@class='radius']");
	
	public LoginPage(WebDriver driver, Logger log) {
		
			super(driver, log);
	}
	
	public SecureAreaPage LogIn(String username,String password)
	{
		log.info("Enter username and password");
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(loginbtnLocator);
		return new SecureAreaPage(driver,log);
	}

}
