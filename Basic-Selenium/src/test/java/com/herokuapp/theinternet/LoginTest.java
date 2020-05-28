package com.herokuapp.theinternet;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

public class LoginTest extends TestUtilities{
		

	@Parameters({"name","password","message"})
	@Test
	public void loginFunction(String name, String password, String message)
	{	
		WelcomePageObject welcomepage=new WelcomePageObject(driver,log);
		welcomepage.openpage();
		LoginPage loginpage=welcomepage.ClickFormAuth();
		SecureAreaPage secureareapage=loginpage.LogIn(name, password);
		secureareapage.VerifyLogin(message);
	}
	
	}
