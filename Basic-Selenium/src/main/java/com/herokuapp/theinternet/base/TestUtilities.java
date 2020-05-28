package com.herokuapp.theinternet.base;

public class TestUtilities extends BaseFunctions {
	
	protected void waitMethod() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
