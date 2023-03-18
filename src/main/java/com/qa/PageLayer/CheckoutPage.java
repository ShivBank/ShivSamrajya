package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class CheckoutPage extends TestBase{
	
	
	// To verify checkout page functionality
	
	
	public CheckoutPage() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/input[1]")
	private WebElement quantity;
	
	public void selectQuantity(String i){
		
//		int i = q;
//		
//		for(i=0;i<q;i++) 	
//			
//			quantity.click();
		
		quantity.clear();
		
		quantity.sendKeys(i);

	}

	
	

	
	// To verify checkout module to navigate to checkout page
	@FindBy(xpath="//header/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]")
    private WebElement checkOut;
	
	public void clickCheckout() throws InterruptedException {
		
		action.moveToElement(checkOut).click().build().perform();
		
		Thread.sleep(2000);
		
	}
	
	
	// To verify radio button for cash on delievery option
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]")
	private WebElement cashOnDelievery;
	
	public void selectCashOnDelievery() {
		
		cashOnDelievery.click();
	}
	
	
	// To verify confirm module to confirm desire delievery
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement confirm;
	
	public void verifyConfirm() {
		
	   confirm.click();
	   
	   driver.switchTo().alert().dismiss();
	
    }
	
	

}

