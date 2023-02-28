package com.qa.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class RegisterPageTest extends TestBase {
	
	
	// To verify register page functionality
	
	@Test(priority=3)
	public void verifyRegisterPage() throws InterruptedException {
		
		home.clickRegisterButton();
		
		register.enterFullName("Shivraj Sanjay Bankar");
		
		register.enterMobileNumber("7887551423");
		
		register.clickNearFranchiese();
		
		Thread.sleep(3000);
		
		register.selectState();
		
		register.selectDistrict();
		
		register.selectTaluka();
		
		register.selectVillage();	
		
		jse.executeScript("scroll(0,400)");
		
		
		register.enterPincode("413102");
		
		register.enterEmailid("sraj1111@gmail.com");
		
		register.enterPassword("sraj1111@gmail.com");
		
        register.reEnterPassword("sraj1111@gmail.com");
		
		register.clickRegister();
	
		driver.close();
	}
	

}
