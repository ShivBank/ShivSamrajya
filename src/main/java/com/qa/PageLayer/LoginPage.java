package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase{
	
	
	// To verify login page using valid user.
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
			
	}
	
	
	// To enter valid username to login 
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement username;
	
	public void enterUsername(String a) {
		
		username.sendKeys(a);
		
	}
	
	// To enter valid password to login
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	
	public void enterPassword(String b) {
		
		password.sendKeys(b);
	}
	
	// To enter login button after filling username / password 
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[2]")
	private WebElement loginbuttons;
	
	public void clickLoginbuttons() {
		
		loginbuttons.click();
		
		
	}
	
	// To verify forgotten password hyperlink and navigating back or not
	@FindBy(xpath="//a[contains(text(),'Forgotten Password ?')]")
	private WebElement forgottenPassword;

	public void verifyForgottenPassword() throws InterruptedException {
		
		forgottenPassword.click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
	}

	
	// To verify register module of login page to navigate register page
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register;
	
	public void clickOnRegister() throws InterruptedException {
		
		register.click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
	}
}

















