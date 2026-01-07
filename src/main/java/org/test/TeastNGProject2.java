package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TeastNGProject2 extends BaseClass{
	
	@Test
	public void tc1() {
		launchUrl("https://mail.google.com/mail/u/0/");
	}
	@Test(invocationCount = 3)
	public void tc2() {
		launchUrl("https://inmakesedu.com/");
	}
	@Test(enabled=false)
	public void tc3() {
		launchUrl("https://www.redbus.com/");
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
