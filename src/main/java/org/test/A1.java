package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A1 extends BaseClass {
	
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
	@Parameters({"user","pass"})
	@Test
	private void tc9(@Optional("abc@gmail.com")String e,@Optional("12345")String pass) {
		
		driver.get("https://en-gb.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ajithvijayakumar05@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("pass");
	
	}
	@Test(enabled=false)
	private void tc1()
	{
		launchUrl("https://www.amazon.com/");
	}
}
