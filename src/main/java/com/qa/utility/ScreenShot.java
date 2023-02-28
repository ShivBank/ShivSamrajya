package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ScreenShot extends TestBase {
	
	
	public ScreenShot () {
		
		PageFactory.initElements(driver, this);
		
	}

	public static void getScreenshot(String nameOfScreenshot) {
		
		String path ="C:\\Users\\Shivraj\\eclipse-workspace\\iStepUp\\ShivSamrajya\\Screenshots\\";
		
		TakesScreenshot ai = (TakesScreenshot)driver;
	
		File src = ai.getScreenshotAs(OutputType.FILE);
		
		
		File scrn = new File(path+nameOfScreenshot+System.currentTimeMillis()+".png");
		
		try {
			
			FileHandler.copy(src, scrn);
		} 
		
		catch (IOException e) {
			
			System.out.println("Path Not Found");
		}
		
	}
	
	
}
