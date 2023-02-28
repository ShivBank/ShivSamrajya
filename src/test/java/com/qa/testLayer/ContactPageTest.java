package com.qa.testLayer;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.qa.testBase.TestBase;

public class ContactPageTest extends TestBase {
	
	
	// To verify Contact Page to enquiry
	@Test(priority=9)
	public void verifyContactPage() throws InterruptedException {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);
		
	    home.clickRegisterButton();
	    
	    login.enterUsername("shivrajbankar.com");
		
	    login.enterPassword("shivrajbankar7887@gmail.com");
	    
	    dash.clickContactUs();
		
		contact.enterName("Shivraj Bankar");
		
		contact.enterName("shivrajbankar0000gmail.com");
		
		jse.executeScript("scroll(0,400)");
		
		contact.enterEnquiry("Thank you");
		
		Thread.sleep(2000);
		
		Assert.assertFalse(false);
		
		contact.clickSubmit();
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
