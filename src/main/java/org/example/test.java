package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	//TestNG order of execution with example
	
	@BeforeSuite
	public void beforeSuite() {
	    System.out.println("Before Suite - Setup environment");
	}
	
	@BeforeTest
	public void beforeTest() {
	    System.out.println("Before Test - Launch browser");
	}
	
	@BeforeClass
	public void beforeClass() {
	    System.out.println("Before Class - Initialize test class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	    System.out.println("Before Method - Login to application");
	}
	
	@Test
	public void testLogin() {
	    System.out.println("Executing Test Case");
	}
	
	@AfterMethod
	public void afterMethod() {
	    System.out.println("After Method - Logout");
	}
	
	@AfterClass
	public void afterClass() {
	    System.out.println("After Class - Close class resources");
	}
	
	@AfterTest
	public void afterTest() {
	    System.out.println("After Test - Close browser");
	}
	
	@AfterSuite
	public void afterSuite() {
	    System.out.println("After Suite - Generate reports");
	}

}
