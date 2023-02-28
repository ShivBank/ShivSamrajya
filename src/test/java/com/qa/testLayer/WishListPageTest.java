package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class WishListPageTest  extends TestBase{
	
	
	// To verify wish list
	
	@Test(priority=8)
	public void verifywishList() throws InterruptedException {
		

        home.clickLoginButtons();
		
		login.enterUsername("shivrajbankar0000@gmail.com");
		
		login.enterPassword("shivrajbankar0000@gmail.com");
		
		login.clickLoginbuttons();
	
		dash.clickWishList();
		
		wish.addToCart();
		
		wish.removeProductOfWishList();
		
		
	}
	

}
