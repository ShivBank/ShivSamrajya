package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.PageLayer.AddToCart_WishList;
import com.qa.PageLayer.CheckoutPage;
import com.qa.PageLayer.ContactPage;
import com.qa.PageLayer.HomePage;
import com.qa.PageLayer.LoginPage;
import com.qa.PageLayer.MainDashboardPage;
import com.qa.PageLayer.RegisterPage;
import com.qa.PageLayer.SearchPage;
import com.qa.PageLayer.WishListPage;
import com.qa.utility.ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	
	 public HomePage home;
	 
	 public LoginPage login;
	 
	 public MainDashboardPage dash;
	
	 public ScreenShot util;
	 
	 public RegisterPage register;
	 
	 public AddToCart_WishList cart;
	 
	 public CheckoutPage check;
	 
	 public ContactPage contact;
	 
	 public WishListPage wish;
	 
	 public SearchPage search;
	 
	 public static Select select;
	 
	 public static Actions action;
	 
	 public static JavascriptExecutor jse;
	 
	 public static WebDriverWait wait;
	 
	 
	 
	//@Parameters("Browser")
	@BeforeMethod
	public void setUp() {
		
		 String br = "Chrome";
		
		if(br.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
		    driver = new ChromeDriver();
			
		}
		
		else if (br.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		
		else if (br.equalsIgnoreCase("Edge")) {
			
			
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
		}
		
		else if (br.equalsIgnoreCase("Internet Explo")) {
			
			WebDriverManager.iedriver().setup();
			
			driver = new InternetExplorerDriver();
		}
		
		else {
				
			System.out.println("Please enter appropriate browser name");
			
		}
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://test.shivsamrajya.com");
		
		home = new HomePage();
		
		login = new LoginPage();
		
		dash = new MainDashboardPage();
		
		util = new ScreenShot();
		
		register = new RegisterPage();
		
		contact = new ContactPage();
		
		cart = new AddToCart_WishList();
		
		check = new CheckoutPage();
		
		wish = new WishListPage();
		
		search = new SearchPage();
		
		action = new Actions(driver);
		
		jse = (JavascriptExecutor)driver;
	
	}
	
	@AfterMethod
	public void tearDown() {
		
		try{
	        driver.quit();
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }
	}
	
	
	
	
	
	
	
	
	

}
