package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClass;

public class LoginPageWithPageFactory extends BaseClass {

	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
  public WebElement getUsername() {
        return username;
	}
	public WebElement getPasswordtxt() {
		return password;
	}
	public WebElement getLoginbutton() {
		return btnLogin;

}
	public LoginPageWithPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	public void Login(String username,String password) {
		getUsername().sendKeys(username);
		getPasswordtxt().sendKeys(password);
		getLoginbutton().click();
	}
}