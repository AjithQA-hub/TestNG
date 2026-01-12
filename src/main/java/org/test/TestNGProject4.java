package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.PrivateKey;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestNGProject4 extends BaseClass {	
	
	@BeforeClass
	private void launchTheBrowser()
	{
		launchBrowser();
		windowMaximize();  
	}
	
	@AfterClass
	private void closeTheBrowser() {
		closeEntireBrowser();
	}
	@DataProvider(name="Amazon Product")
	public Object datas()
	{
		return new Object[][]
				{
			{"Shirt"},
			{"Pant"},
			{"Track Pant"},
			{"Tee Shirts"}
				};
	}
	@Test(dataProvider = "Amazon Product")
	private void tc1(String product) throws AWTException, InterruptedException
	{
		launchUrl("https://www.amazon.com/");
		windowMaximize();
		Thread.sleep(1000);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(product);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
