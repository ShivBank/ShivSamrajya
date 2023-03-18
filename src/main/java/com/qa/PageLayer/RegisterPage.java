package com.qa.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class RegisterPage extends TestBase{
	
	
	
	// To verify register page 
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	// Verify Full name tab and enter full name
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/input[1]")
	private WebElement fullName;
	
	public void enterFullName(String fn) {
		
		fullName.sendKeys(fn);
		
	}

	
	// To verify mobile number tab
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/div[1]/input[1]")
	private WebElement mobileNumber;
	
	public void enterMobileNumber(String mn) {
		
		mobileNumber.sendKeys(mn);
		
	}
	
	// To select franchise
	@FindBy(xpath="//select[@id='order']")
	private WebElement nearFranchiese;
	
	public void clickNearFranchiese() {
		
		select = new Select(nearFranchiese);
		
		select.selectByValue("460 ");
	}
	

	// To select state 
	@FindBy(xpath="//select[@id='state_id']")
	private WebElement state;
	
	public void selectState(String sta) {
		
		select = new Select(state);
		
		select.selectByValue(sta);
		
	}
	
	// To select district 
	@FindBy(xpath="//select[@id='distric_id']")
	private WebElement district;
	
	public void selectDistrict() {
		
		select = new Select(district);
		
		select.selectByValue("22");
	}
	
	// To select taluka
	@FindBy(xpath="//select[@id='talu_id']")
	private WebElement taluka;
	
	public void selectTaluka() {
		
		select = new Select(taluka);
		
		select.selectByVisibleText("Baramati");
	}
	
	// To select village 
	@FindBy(xpath="//select[@id='village_id']")
	private WebElement village;
	
	public void selectVillage() {
		
		select = new Select(village);
		
		select.selectByValue("25526");
	}
	
	// To enter pincode
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[13]/div[1]/input[1]")
	private WebElement pincode;
	
	public void enterPincode(String p) {
		
		pincode.sendKeys(p);
		
		
		jse.executeScript("scroll(0,400)");
		
	}
	
	// To enter mail
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	
	public void enterEmailid(String emails) {
		
		email.sendKeys(emails);
	}
	
	// To enter password
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;
	
	public void enterPassword(String pass) {
		
		password.sendKeys(pass);
	}
	
	// To reenter password
	@FindBy(xpath="//input[@id='txtConfirmPassword']")
	private WebElement rePassword;
	
	public void reEnterPassword(String repass) {
		
		rePassword.sendKeys(repass);
	}
	
	// To click on register 
	@FindBy(xpath="//input[@id='btnSubmit']")
	private WebElement register;
	
	public void clickRegister() {
		
		register.click();
	}
}