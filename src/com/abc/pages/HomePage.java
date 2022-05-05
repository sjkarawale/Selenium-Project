package com.abc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClass;

public class HomePage extends LoginPage  {

	//Page object model with page factory concept
	
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement myinfolink;
	//Locator of Myinfo
	
	public HomePage()  {
		Login("Admin", "admin123");
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public WebElement getMyInfolink() {
		return myinfolink;
		
	
	}

	

	
}











