package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin extends BaseClass{
	
	//1. Non parameterized constructor
	public FbLogin(){
		PageFactory.initElements(driver, this);
	}
	
	//2.private web elements
	//webElement email= driver.findElement(By.is("email"));
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	//3.getters to access webElements outside the class

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	

}
