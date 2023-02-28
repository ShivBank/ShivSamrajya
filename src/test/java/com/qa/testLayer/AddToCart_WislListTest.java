package com.qa.testLayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class AddToCart_WislListTest extends TestBase {
	
	@Test(priority=6)
	public void verifyAddToCart_Wishlist() throws InterruptedException{
		
	   
		
        home.clickLoginButtons();
		
		login.enterUsername("shivrajbankar0000@gmail.com");
		
		login.enterPassword("shivrajbankar0000@gmail.com");
		
		login.clickLoginbuttons();
		
		dash.verifyCategories();
		
		cart.clickGlassProduct();
		
		Thread.sleep(2000);
		
		cart.clickToProduct();
		
		Thread.sleep(2000);
		
		cart.clickAddToCart();
		

		
		cart.clickFavourite();
		
		driver.close();
		
		
		
		
		
		
		
		
	}
	
	

}
