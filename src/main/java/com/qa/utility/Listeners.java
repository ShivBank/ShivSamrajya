package com.qa.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	
	public void onTestStart(ITestResult result) {
	
		System.out.println("Test Case Execution Started "+result.getName());
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Case Started Successfully "+result.getName());
	}


	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Case Failed "+result.getName());
		
		ScreenShot.getScreenshot(result.getName());
		
		System.out.println("Screenshot Taken Successfully "+result.getName());
	}

}
