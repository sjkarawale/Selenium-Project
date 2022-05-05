package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.utility.BaseClass;

public class ForgotPasswordPage {

	public WebElement getForgotYourPassLink() {
		return BaseClass.driver.findElement(By.partialLinkText("Forgot your password"));
	}
	
	public WebElement getEnterUsername() {
		return BaseClass.driver.findElement(By.id("securityAuthentication_userName"));
	}
	
	public WebElement getResetpasswordbtn() {
		return BaseClass.driver.findElement(By.id("btnSearchValues"));
	}
	
	public void Forgot(String link) {
		getForgotYourPassLink().click();
		getEnterUsername().sendKeys("Admin");
		getResetpasswordbtn().click();
	}

	
		
	}

	

