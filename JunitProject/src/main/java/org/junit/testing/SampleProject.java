  package org.junit.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleProject {
	
	@Test
	public void tc3()
	{
		System.out.println("Test Case 3");
	}
	@Before
	public void startDate() {
		System.out.println("Test Case Start Date and Time");
	}
	@After
	public void endDate()
	{
		System.out.println("Test Case End Date and Time");
	}
	@BeforeClass
	public static void launchBrowser()
	{
		System.out.println("Browser Launch");
	}
	
	@AfterClass
	public static void CloseTheBrowser()
	{
		System.out.println("Close The Browser");
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
	}
	@Test
	public void tc4()
	{
		System.out.println("Test Case 4");
	}
	@Ignore
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
	}

}
