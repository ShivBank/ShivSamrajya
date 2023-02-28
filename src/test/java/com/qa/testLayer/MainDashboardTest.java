package com.qa.testLayer;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class MainDashboardTest extends TestBase{
	
	
	@Test(priority=4)
	public void verifyDashboard() throws InterruptedException {
		
		
		home.clickLoginButtons();
		
		login.enterUsername("shivrajbankar0000@gmail.com");
		
		login.enterPassword("shivrajbankar0000@gmail.com");
		
		login.clickLoginbuttons();
		
		dash.verifySearchBar();
	
		Thread.sleep(2000);
		
		dash.clickBackToTopModule();
		
		Thread.sleep(3000);
		
		dash.clickName();
			
		dash.clickWishList();
		
		Thread.sleep(1000);
		
		dash.clickMobileNumber();
		
		Thread.sleep(1000);
		
		dash.clickMail();
		
		Thread.sleep(1000);
		
		dash.clickOrder();
		
		Thread.sleep(1000);
		
		dash.clickItoms();
		
		Thread.sleep(2000);
		
		dash.clickHomeSymbol();
		
		Thread.sleep(1000);
		
		dash.verifyCategories();
		
		Thread.sleep(2000);
		
        dash.verifyBrands();
		
		Thread.sleep(1000);
		
		dash.clickShop();
		
		Thread.sleep(1000);
		
		dash.clickAboutUs();
		
		Thread.sleep(1000);
		
		dash.clickBlog();
		
		Thread.sleep(1000);
		
		dash.clickContactUs();
		
		Thread.sleep(3000);
		
		dash.clickHomeSymbol();
		
		dash.clickOnNavigationArrow();
		
		dash.clickLogOut();
		
		
		driver.close();
		
	}
	
	
	

}
