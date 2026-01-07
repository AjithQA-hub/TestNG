package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Date;
import org.base.BaseClass;


public class A extends BaseClass {
	
	@BeforeClass
	private void launchTheBrowser()
	{
		launchBrowser();
		windowMaximize();  
	}
	
	@AfterClass
	private void endDate()
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	@BeforeClass
	private void startDate()
	{
		Date d=new Date();
		System.out.println(d);	  
	}
	@Test
	private void tc1() {
		launchUrl("https://en-gb.facebook.com/");
		FbLogin f=new FbLogin();
		passText("ajithkumarvam1@gmail.com", f.getEmail());
		passText("Ajith!123", f.getPassword());
	}
	@Test (enabled=false)
	private void tc5() {
		launchUrl("https://www.snapdeal.com/");
	}
	@Test (invocationCount=3) 
	private void tc2() {
		launchUrl("https://www.flipkart.com/");
	}
}
