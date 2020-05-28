package com.herokuapp.theinternet.base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseFunctions {
	
protected WebDriver driver;
protected Logger log;
	
	@Parameters({"browser"})
	@BeforeMethod(alwaysRun=true)
	public void intializeDriver(String browser, ITestContext ctx)
	{
		String testName = ctx.getCurrentXmlTest().getName();
		log = LogManager.getLogger(testName);
		BrowserDriverFactory factory=new BrowserDriverFactory(browser,log);
		driver=factory.createDriver();
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeDriver()
	{
		log.info("Close driver");
		driver.quit();
	}

}