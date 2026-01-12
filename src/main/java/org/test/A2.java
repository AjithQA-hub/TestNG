package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A2 extends BaseClass {		//sampleTest2 class use
	
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
	
	@DataProvider(name="Sample Data")
	private Object[][] data() {
		return new Object[][]
				{
			{"ajithkumarvam1@gmail.com","Ajith!123"},
			{"abc@gmail.com","abc123"},
			{"defg@gmail.com","defg123"},
			{"hijk@gmail.com","hijk123"}
			
				};

	}
	@Test(dataProvider = "Sample Data")
	private void tc9(String e,String pass) {
		
		driver.get("https://en-gb.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(e);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(pass);
	
	}
	@Test(enabled=false)
	private void tc1()
	{
		launchUrl("https://www.amazon.com/");
	}
}
