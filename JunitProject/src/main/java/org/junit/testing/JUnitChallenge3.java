package org.junit.testing;

//import java.util.Date;

import org.base.BaseClass;
import org.base.FbLogin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitChallenge3 extends BaseClass {
	
	@Test
	public void tc3()
	{
		System.out.println("Test Case 3");
	}
	
	@Before
	public void startDate() {
		//Date d=new Date();
		//System.out.println(d);
		launchBrowser();
		windowMaximize();
	}
	@After
	public void endDate()
	{
		//Date d=new Date();
		//System.out.println(d);
		//launchBrowser();
		//windowMaximize();
	}
	@BeforeClass
	public static void launchTheBrowser()
	{
		launchBrowser();
		windowMaximize();  
	}
	
	@AfterClass
	public static void CloseTheBrowser()
	{
		
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://mail.google.com/mail/u/0/#inbox");
		String title = pageTitle();
		String url = pageUrl();
		FbLogin f=new FbLogin();
		passText("ajithkumarvam1@gmail.com", f.getEmail());
		Assert.assertEquals("Check your URL", url, url.contains("Gmail"));
		//passText("Ajith!123", f.getPassword());
	}

}
