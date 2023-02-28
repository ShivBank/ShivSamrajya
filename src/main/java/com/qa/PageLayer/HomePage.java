package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase {
	
	
	// First page after hitting url
	
	public HomePage() {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	// To verify Login hyperlink of home page to navigate on login page or navigating back or not 
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginbutton;
	
	public void clickLoginButtons() throws InterruptedException {
		
		loginbutton.click();
		
		Thread.sleep(3000);
		
		//driver.navigate().back();
		
	}
	
	// To verify register hyperlink of home page to navigate on register page and navigating back or not 
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register;
	
	public void clickRegisterButton() throws InterruptedException{
		
		register.click();
		
		Thread.sleep(3000);
		
	
	}
	
	
	// To verify Logo of build
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement logo;
	
	public void verifyLogo() {
		
		boolean display = logo.isDisplayed();
		
		System.out.println("Logo Displaying : "+display);
		
		
		
	}
	

	
	// To verify URL 
	public void  verifyUrl() {
		
		String expectedUrl ="https://test.shivsamrajya.com/";
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Actual url is "+url);
		
		if(expectedUrl.equals(url)) {
			
			System.out.println("Url is same to as you expect");
			
		}
		
		else {
			
			System.out.println("Url is incorrect");
		}
		
	}


	// To verify title of build
	public  void verifyTitle() {
		
	String expecTitle = "Welcome To Shivsamrajya";
		
	String actuTitle = driver.getTitle();
	
	System.out.println("Actual Title is "+ actuTitle);
	
	if(expecTitle.equals(actuTitle)) {
		
		System.out.println("Expected and actual title is matching");
	}
	else {
		
		System.out.println("Expected and actual title is not matching");
	}
	
	}
	
	
	
	

}
