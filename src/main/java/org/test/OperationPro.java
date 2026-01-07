package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationPro {
	

	@Test
	private void tc4()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com");
		driver.manage().window().maximize();
	}
	

	@Test
	private void tc5()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/movies");
		driver.manage().window().maximize();
	}
	

	@Test
	private void tc6()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.pnbindia.in/");
		driver.manage().window().maximize();
	}
	

}
