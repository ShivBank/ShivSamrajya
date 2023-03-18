package com.qa.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	// Test script to verify login page functionality
		@Test(dataProvider="TestData")
		public void verifyLoginPage(String un,String pwd) throws InterruptedException {
			
			
			home.clickLoginButtons();
			
			login.enterUsername(un);
			
			Thread.sleep(2000);
			
			login.enterPassword(pwd);
			
	        login.verifyForgottenPassword();
			
			login.clickOnRegister();
			
			login.clickLoginbuttons();
			
			Thread.sleep(3000);
			
		}
		
		@DataProvider(name="TestData")
		public Object[][] rushi(){
		
			return new Object[][] {
		
				{"shikar0000@gmail.com","shivrajb000@gmail.com"},
				{"shivrajkar0000@gmail.com","shivrajbankar0@gmail.com"},
				{"shivrajbanka00@gmail.com","shivrajbankar00gmail.com"},
				{"SKDGHKDHGK","HFDSJHERK"},
				{"shivrajbankar0000@gmail.com","shivrajbankar0000@gmail.com"}
		
			};
				
		
}
}