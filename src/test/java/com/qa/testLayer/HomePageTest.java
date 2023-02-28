package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.HomePage;
import com.qa.testBase.TestBase;

public class HomePageTest extends TestBase {

	
	
	@Test(priority=1)
	public void verifyHomePage() throws InterruptedException {
	
		
		home.verifyLogo();
		
		home.verifyUrl();

		home.verifyTitle();
		
		home.clickRegisterButton();
	
		home.clickLoginButtons();

		
	}
	
	

}
