package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGProject1 {
	
	@Test
	private void tc1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	private void tc5() {
		System.out.println("Test Case 5");
	}
	
	@Test
	private void tc9() {
		System.out.println("Test Case 9");
	}
	
	@BeforeMethod
	private void startDate() {
		System.out.println("Test Case starting Date and Time");
	}
	
	@AfterMethod
	private void endDate()
	{
		System.out.println("Test Case Ending Date and Time");
	}
	
	@BeforeClass
	private void launchTheBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterClass
	private void closeTheBrowser() {
		System.out.println("Browser Close");
	}

}
