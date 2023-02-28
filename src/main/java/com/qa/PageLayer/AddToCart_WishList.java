package com.qa.PageLayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class AddToCart_WishList extends TestBase{
	
	
	// To verify functionality which uses in process of add to cart
	
	
	public AddToCart_WishList() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// To click glass product
	@FindBy(xpath="//body/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[10]/a[1]")
	private WebElement glassProduct;
	
	public void clickGlassProduct() throws InterruptedException {
		
		action.moveToElement(glassProduct).click().build().perform();
		
		jse.executeScript("scroll(0,400)");
		
		
		Thread.sleep(2000);
		
		
	}
	//To click add to cart
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement product;
		
	public void clickToProduct() throws InterruptedException {
			
			
	    Thread.sleep(3000);
			
	    action.moveToElement(product).click().build().perform();

			
		}
	
	
	//To click add to cart
	@FindBy(xpath="//span[contains(text(),'Add To Cart')]")
	private WebElement addToCart;
	
	public void clickAddToCart() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		action.moveToElement(addToCart).build().perform();
		
		action.click();
		
		Thread.sleep(2000);
		
	}

	// To add in wish list
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/button[1]")
	private WebElement addToWishList;
	
	public void clickFavourite() {
		
		action.moveToElement(addToWishList).click().build().perform();
		
	}
	

//	@FindBy(xpath="//body/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[11]/a[1]")
//	private WebElement stationaryItoms;
//	
//	public void verifyCategory_StationaryItoms() throws InterruptedException {
//		
//		action.moveToElement(stationaryItoms).click().build().perform();
//		
//		Thread.sleep(2000);
//
//		
//	}
//	// To verify categories module of main dashboard page or navigating page
//	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]/span[1]")
//	private WebElement addToCart;
//	
//	public void verifycelloTape_addToCart() throws InterruptedException {
//	
//	Thread.sleep(1000);;
//
//	addToCart.click();
//	
}
