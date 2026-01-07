package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//for sample TestTNG 11
public class GenerationOne {
	
	@Test
	private void tc4()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://youtube.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	private void tc5()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/");
		driver.manage().window().maximize();
	}
	
	@Test
	private void tc6()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}

}
