package com.qa.PageLayer;

import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.testBase.TestBase;

public class MainDashboardPage extends TestBase {
	
	//To verify all functionallity of main dashboard page after login page
	
	
	
	public MainDashboardPage() {

		PageFactory.initElements(driver,this);
		
			
		}

	
	    // To verify search bar 
	    @FindBy(xpath="//input[@id='filter_name']")
	    private WebElement searchbar;
	
	    public void verifySearchBar() {
		
		boolean search = searchbar.isDisplayed();
		
		boolean bar = searchbar.isEnabled();
		 
		searchbar.click();
		 
	    System.out.println("SearchBar Displaying : "+ search);
		
		System.out.println("SearchBar Enabled : " + bar);
	}

	
	    // To verify backToTop module to scroll up 
		@FindBy(xpath="//body/div[1]/div[1]/footer[1]/div[2]/div[2]/a[1]/i[1]")
		private WebElement backToTop;
		
		public void clickBackToTopModule() {
			
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");			
			
			backToTop.click();
		}
		
		
		// To verify header name of main dashboard page or navigating  after clicking on that
		@FindBy(xpath="//header/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
	    private WebElement name;

		public void clickName() {
		
		boolean na = name.isDisplayed();
		
		boolean me = name.isEnabled();
	
		System.out.println("Header Name Displaying : "+na);

		System.out.println("Header Name Enabled : "+me);
		
		action.moveToElement(name).click().build().perform();
		
		driver.navigate().back();

		}
		
		
		// To verify header wish list of main dashboard page or navigating back after clicking on that
		@FindBy(xpath="//a[@id='wishlist-total']")
		private WebElement wishList;
		
		public void clickWishList() {
		
		boolean wish = wishList.isDisplayed();
		
		boolean list = wishList.isEnabled();
	
		System.out.println("WishList Displaying : "+wish);
		
		System.out.println("WishList Enabled : "+ list);
		
		action.moveToElement(wishList).perform();
		 
		wishList.click();
		
		}
		
		// To verify header mobile number of main dashboard page or navigating back after clicking 
		@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
		private WebElement mobileNumber;
		
		public void clickMobileNumber() throws InterruptedException {
		
		boolean mobile = mobileNumber.isDisplayed();
		
		boolean number= mobileNumber.isEnabled();
	
		System.out.println("Mobile Number Displaying : "+mobile);
		
	    System.out.println("Mobile Number Enabled : "+number);
	    
	    action.moveToElement(mobileNumber).perform();
	    
	    //mobileNumber.click();
		
	    //driver.switchTo().alert().dismiss();
		
		}
		
		
		// To verify header email module of main dashboard page or navigating page 
		@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
		private WebElement mail;
		
		public void clickMail() {
		
		boolean ma = mail.isDisplayed();	
	
		boolean il= mail.isEnabled();
	
		System.out.println("Mail Displaying : "+ma);
		
		System.out.println("Mail Enabled : "+il);
		
		action.moveToElement(mail).perform();
		
		//mail.click();
		
		}
		
		
		// To verify header order module of main dashboard page or navigating page
		@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
		private WebElement order;
		
		public void clickOrder() {
		
		boolean ord = order.isDisplayed();
		
		boolean er = order.isEnabled();
	
		System.out.println("Order Displaying : "+ord);
		
		System.out.println("Order Enabled : "+ er);
		
		action.moveToElement(order).click().build().perform();;
		
		}
		
		
		// To verify header itoms module of main dashboard page or navigating page
		@FindBy(xpath="//header/div[1]/div[1]/div[4]/div[1]/button[1]")
		private WebElement itoms;
		
		public void clickItoms() {
		
		boolean ito = itoms.isDisplayed();
		
		boolean ms  = itoms.isEnabled();
	
		System.out.println("Itoms Displaying : "+ito);
		
		System.out.println("Itoms Enabled : "+ms);

		action.moveToElement(itoms).perform();
		 
        itoms.click();
		
		//driver.navigate().back();
		}
		
		// To verify Home Symbol module of main dashboard page or navigating page
		@FindBy(xpath="//body/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")
		private WebElement homeSymbol;
		
		public void clickHomeSymbol() {
		
		boolean sym = homeSymbol.isDisplayed();
			
		boolean bol = homeSymbol.isEnabled();
			 
		System.out.println("HomeSymbol Displaying : "+ sym);

		System.out.println("HomeSymbol Enabled : "+ bol);
		
		action.moveToElement(homeSymbol).perform();
		 
		homeSymbol.click();
			 
		
		}
		
		// To verify categories module of main dashboard page or navigating page
		@FindBy(xpath="//a[contains(text(),'Categories')]")
		private WebElement categories;
		
		public void verifyCategories() {
			
		boolean cate = categories.isDisplayed();
			
		boolean gories = categories.isEnabled();
		
		System.out.println("Categories Displaying : "+ cate);
			
		System.out.println("Categories Enabled : " + gories);
		
		action.moveToElement(categories).build().perform();
		
		//categories.click();
			
		}
		
		
		// To verify brands module of main dashboard page or navigating page
		@FindBy(xpath="//a[contains(text(),'Brands')]")
		private WebElement brands;
		
		public void verifyBrands() {
			
		boolean br = brands.isDisplayed();
			
		boolean ands = brands.isEnabled();
			
		System.out.println("Brands Displaying : "+br);
			
		System.out.println("Brands Enabled : "+ ands);
		
		action.moveToElement(brands).perform();
		
		//brands.click();
			
		}
		
		// To verify shop module of main dashboard page or navigating page
		@FindBy(xpath="//a[contains(text(),'Shop')]")
		private WebElement shops;
		
		public void clickShop() {
			
		boolean sh = shops.isDisplayed();
			
		boolean ops = shops.isEnabled();
			
		System.out.println("Shop Displaying : "+sh);
			
		System.out.println("Shop Enabled : " +ops );
		
		action.moveToElement(shops).perform();
		
		shops.click();
			
			
		}

		// To verify about us module of main dashboard page or navigating page
		@FindBy(xpath="//a[contains(text(),'About-Us')]")
        private WebElement aboutUs;
		
		public void clickAboutUs() {
			
		boolean about = aboutUs.isDisplayed();
			
		boolean Us = aboutUs.isEnabled();
			
		System.out.println("AboutUs Displaying : "+about);
			
		System.out.println("AboutUs Enabled : "+Us);
		
		action.moveToElement(aboutUs).perform();
		
		aboutUs.click();
		
		}
		
		
		// To verify blog module of main dashboard page or navigating page
		@FindBy(xpath="//a[contains(text(),'Blog')]")
		private WebElement blog;
		
		public void clickBlog() {
			
		boolean bl = blog.isDisplayed();
			
		boolean og = blog.isEnabled();
			
		System.out.println("Blog Displaying : "+bl);
			
		System.out.println("Blog Enabled : "+ og);
		
		action.moveToElement(blog).perform();
		
		blog.click();
		
		driver.navigate().back();
			
		}
		
		
		// To verify contactUs module of main dashboard page or navigating page
		@FindBy(xpath="//body/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[7]/a[1]")
		private WebElement contactUs;
		
		public void clickContactUs() throws InterruptedException {
			
		boolean con = contactUs.isDisplayed();
			
		boolean tact = contactUs.isEnabled();
			
		System.out.println("ContactUs Displaying : "+con);
			
		System.out.println("ContactUs Enabled : "+ tact);
			
        action.moveToElement(contactUs).perform();
			
		contactUs.click();
			
		Thread.sleep(3000);
			
	   // driver.navigate().back();
			
			
		}
		
		
		// To verify arrow to navigate right left 
		@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/i[1]")
        private WebElement toNavigate;
		
		public void clickOnNavigationArrow() throws InterruptedException {
			
		Thread.sleep(3000);
			
		jse.executeScript("scroll(0,500)");
			
		Thread.sleep(2000);
			
		action.moveToElement(toNavigate).doubleClick().build().perform();
			
		Thread.sleep(3000);
		}
		
		
		//To verify footwear module of main dashboard and navigate back to dashboard
		@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
		private WebElement footwears;
		
		public void clickFootwears() throws InterruptedException {
			
		jse.executeScript("argument[0].scrollIntoView;",footwears);
			
		action.moveToElement(footwears).click().build().perform();
			
		Thread.sleep(3000);
			
		driver.navigate().back();
			
			
			
		}
		
		// To verify header log out module of main dashboard page or navigating back or not after clicking on that 
		@FindBy(xpath="//a[contains(text(),'Log Out')]")
	    private WebElement logOut;
			
		public void clickLogOut() {
				
		boolean log = logOut.isDisplayed();
				
		boolean out = logOut.isEnabled();
			
		System.out.println("LogOut Displayed : "+log);
				
		System.out.println("LogOut Enabled : "+out);
				
		jse.executeScript("scroll(1000,0)");
				 
		action.moveToElement(logOut).click().build().perform();
				
			
				}
		
		
		
	}

	
	

