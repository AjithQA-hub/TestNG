package org.test;

import org.testng.annotations.Test;

public class B3 {
	
	@Test(dataProvider = "Amazon Data",dataProviderClass = A3.class)
	private void tc33(String data) {
		System.out.println(data);
	}
	@Test
	private void tc11() {
		System.out.println("Test Case 11");
	}
	@Test
	private void tc22() {
		System.out.println("Test Case 22 ");
	}

}
