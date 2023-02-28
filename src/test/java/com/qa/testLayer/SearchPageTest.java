package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class SearchPageTest extends TestBase {
	
	// Verify search functionality to search any product
	
	@Test(priority=5)
	public void searchProduct() throws InterruptedException {
		
        home.clickLoginButtons();
		
		login.enterUsername("shivrajbankar0000@gmail.com");
		
		login.enterPassword("shivrajbankar0000@gmail.com");
		
		login.clickLoginbuttons();
		
		search.search("soap");	
		
		search.clickOnSearchSymbol();
		
		//dash.clickLogOut();
		
	
	
	
	}
	
	
	
	
	
	
	

}
