package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ContactPage extends TestBase{
	
	
		
	// To verify enquiry page 
	
	
	public ContactPage () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// To enter name for enquiry
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement name;
	
	public void enterName(String nme) {
		
		name.sendKeys(nme);
	}
	
	
	// To enter mail for enquiry
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	
	public void enterEmail(String mail) {
		
		email.sendKeys(mail);
	}
	
	
	// enquiry box to send message
	
	@FindBy(xpath="//textarea[@id='input-enquiry']")
	private WebElement enquiry;
	
	public void enterEnquiry(String enqu) {
		
		enquiry.sendKeys(enqu);
		
	}
	
	// To verify sumbit button
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElement submit;
	
	public void clickSubmit() {
		
		submit.click();
		
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
}





