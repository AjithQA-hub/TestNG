package org.junit.testing;

//import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleProject2 extends BaseClass {
	
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
		launchBrowser();
		windowMaximize();
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
		closeEntireBrowser();
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://en-gb.facebook.com/");
	}
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
		launchUrl("https://www.snapdeal.com/");
	}
	@Ignore
	@Test
	public void tc4()
	{
		System.out.println("Test Case 4");
		launchUrl("https://www.myntra.com/");
	}
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		launchUrl("https://www.flipkart.com/");
		
	}

}
