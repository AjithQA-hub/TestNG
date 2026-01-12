package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.base.BaseClass;
import org.base.FbLogin;


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
		closeEntireBrowser();
	}
	
	@Test (invocationCount=3)
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
	@Test
	private void tc2() {
		launchUrl("https://www.flipkart.com/");
	}
}
