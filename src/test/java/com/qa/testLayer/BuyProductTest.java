package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class BuyProductTest extends TestBase{

	
	
	// To verify flow to buy product
	
	@Test(priority=7)
	public void buyProduct() throws InterruptedException {
		
		home.clickLoginButtons();
		
		login.enterUsername("shivrajbankar0000@gmail.com");
		
		login.enterPassword("shivrajbankar0000@gmail.com");
		
		login.clickLoginbuttons();
		
		dash.verifyCategories();
		
		cart.clickGlassProduct();
		
		cart.clickToProduct();
		
		cart.clickAddToCart();
		
		cart.clickFavourite();
		
		dash.clickItoms();
		
		Thread.sleep(3000);
		
		check.selectQuantity("4");
		
		Thread.sleep(3000);
		
		check.clickCheckout();
		
		Thread.sleep(2000);
		
		check.selectCashOnDelievery();
		
		Thread.sleep(2000);
		
		check.verifyConfirm();
		
		Thread.sleep(3000);
		
		dash.clickLogOut();
	
		Thread.sleep(2000);
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
