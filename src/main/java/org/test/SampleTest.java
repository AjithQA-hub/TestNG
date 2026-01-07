package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.base.FbLogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SampleTest extends BaseClass{
	
	@Test(invocationCount = 3)
	public void tc1() {
		launchUrl("https://www.facebook.com/");
		FbLogin f=new FbLogin();
		passText("9003493942", f.getEmail());
		passText("Ajith!123", f.getPassword());
	}
	@Test(enabled=false)
	public void tc9() {
		launchUrl("https://www.amazon.com/");
	}
	@Test
	public void tc5() {
		launchUrl("https://www.flipkart.com/");
	}
	
	@BeforeMethod
	private void startDate(){
		Date d=new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endDate()
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
	private void closeTheBrowser() {
		System.out.println("Browser Close");
	}
	
	
	
	
	
	
	
	
	
	

}
