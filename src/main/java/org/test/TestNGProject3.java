package org.test;

import org.testng.annotations.Test;

public class TestNGProject3 {
	
	@Test(priority = 3 )
	private void tc1() {
		System.out.println("https://mail.google.com/mail/u/0/");
	}
	@Test
	private void tc2() {
		System.out.println("https://inmakesedu.com/");
	}
	@Test(priority = 2 )
	private void tc3() {
		System.out.println("https://www.redbus.in/");
	}
	@Test(priority = -20 )
	private void tc4() {
		System.out.println("https://www.flipkart.com/");
	}
	@Test(priority = 1000 )
	private void tc5() {
		System.out.println("https://www.amazon.com/");
	}
	@Test(priority = 2000 )
	private void tc6() {
		System.out.println("https://www.facebook.com/");
	}
	@Test(priority = 1500 )
	private void tc7() {
		System.out.println("https://www.youtube.com/");
	}

}
