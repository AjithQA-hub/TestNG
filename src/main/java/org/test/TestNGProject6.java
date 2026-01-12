package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.base.BaseClass;
import org.base.FbLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGProject6 extends BaseClass { // SampleTestTNG10
 	
	@Test
	private void tc3() {
		System.out.println("Tc3 : " + Thread.currentThread().threadId()); //threadId() = Java 19+ --- getId() = Java <18 version
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.close();
	}

	@Test
	private void tc2() {
		System.out.println("Tc2 : " + Thread.currentThread().threadId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ajithkumarvam1@gmail.com");
		driver.close();
	}

	@Test
	private void tc1() {
		System.out.println("Tc1 : " + Thread.currentThread().threadId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		driver.close();
	}
}
