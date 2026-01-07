package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTestTNG9 extends BaseClass {
	
	@BeforeClass
	private void launchTheBrowser()
	{
		launchBrowser();
		windowMaximize();
	}
	@AfterMethod
	private void endDate()
	{
		Date d=new Date();
		System.out.println(d);
	}
	@BeforeMethod
	private void startDate()
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test
	private void tc1()
	{
		driver.get("https://en-gb.facebook.com/");
		
		String title = pageTitle();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ajithkumarvam@gmail.com");
		///hardAssert
		Assert.assertTrue(title.contains("facebook"), "Check your page title");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Ajith!123");	
	}
	@Test
	private void tc2()
	{
		driver.get("https://en-gb.facebook.com/");
		
		String title = pageTitle();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ajithkumarvam1@gmail.com");
		///softAssert
		SoftAssert s=new SoftAssert();
		s.assertTrue(title.contains("facebook"), "Check your page title");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Ajith!123");	
		
		s.assertAll();//To find it is failed or not 
	}
	
	@Test(enabled=false)
	private void tc5(){
		launchUrl("https://www.flipkart.com/");
	}
}
