package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class WishListPage  extends TestBase{

	
	// To verify wish list to add to cart or remove
	
	public WishListPage() {
		
		PageFactory.initElements(driver, this);

	}
	
	// To add to cart product from wish list
	@FindBy(xpath="//tbody/tr[2]/td[6]/a[1]/i[1]")
	private WebElement addToCart;
	
	public void addToCart() {
		
		addToCart.click();
		
		driver.switchTo().alert().dismiss();
	}
	
	
	// To remove product from wish list
	@FindBy(xpath="//tbody/tr[2]/td[6]/a[2]/i[1]")
	private WebElement remove;
	
	public void removeProductOfWishList() {
		
		remove.click();
		
	}
	
	
}
