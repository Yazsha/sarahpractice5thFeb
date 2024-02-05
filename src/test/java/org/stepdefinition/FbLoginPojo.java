package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends UtilityClass{
	
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement passWord;
	
	 @FindBy(name="login")
	 
	 private WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	

	public WebElement getPassWord() {
		return passWord;
	}

	
	public WebElement getLoginButton() {
		return loginButton;
	}

	
		

}
