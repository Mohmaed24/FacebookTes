package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPogoClass extends CodeReuse{

	public LoginPogoClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	})
	private WebElement txtUsername;
	
	
	@FindBys({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@placeholder='Password']")
	})
	private WebElement txtPassword;
	
	@CacheLookup
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
