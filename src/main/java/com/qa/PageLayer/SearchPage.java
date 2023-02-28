package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SearchPage extends TestBase {

	public SearchPage () {
		
		PageFactory.initElements(driver,this);
		
	}
	

	@FindBy(xpath="//input[@id='filter_name']")
	private WebElement search;
	
	public void search(String product) {
		
		search.sendKeys(product);
		
	}
	
	
	@FindBy(xpath="//header/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]/i[1]")
	private WebElement clickOnSearch;
	
	public void clickOnSearchSymbol() {
		
		clickOnSearch.click();
		
		
	}
	
	
	
}
