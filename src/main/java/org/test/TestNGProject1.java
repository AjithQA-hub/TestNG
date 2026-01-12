package org.test;

import java.util.Date;

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
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endDate()
	{
		Date d = new Date();
		System.out.println(d);
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
