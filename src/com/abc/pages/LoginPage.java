package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.utility.BaseClass;

public class LoginPage {
public WebElement getUsername() {
	return BaseClass.driver.findElement(By.id("txtUsername"));

}
public WebElement getPasswordtxt() {
	return BaseClass.driver.findElement(By.id("txtPassword"));

}
public WebElement getLoginbutton() {
	return BaseClass.driver.findElement(By.id("btnLogin"));

}/*public void Login(String username,String password) {
		getUsername().sendKeys(username);
		 BaseClass.driver.findElement(By.id("txtPassword")).sendKeys(password);
		 BaseClass.driver.findElement(By.id("btnLogin")).click();
	}*/
	public void Login(String username,String password) {
		getUsername().sendKeys(username);
		getPasswordtxt().sendKeys(password);
		getLoginbutton().click();
	}
	
}
