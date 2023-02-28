package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	// Test script to verify login page functionality
	@Test(priority=2)
	public void verifyLoginPage() throws InterruptedException {
		
		
		home.clickLoginButtons();
		
		login.enterUsername("shivrajbankar0000@gmail.com");
		
		Thread.sleep(2000);
		
		login.enterPassword("shivrajbankar0000@gmail.com");
		
        login.verifyForgottenPassword();
		
		login.clickOnRegister();
		
		login.clickLoginbuttons();
		
		Thread.sleep(3000);
		
	}
	
	
	

}
