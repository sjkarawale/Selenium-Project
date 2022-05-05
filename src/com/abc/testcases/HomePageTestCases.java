package com.abc.testcases;

import com.abc.pages.ForgotPasswordPage;
import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.pages.MyInfoPage;
import com.abc.utility.BaseClass;

public class HomePageTestCases {

	//Verify that user should be able to modify my info
	//Steps-
	//Prequite - User should be login successfully 
	//Click on my info 
	//Click on edit button
	//Update the firstname and click on Save
	 
public static void main(String[] args) {
	BaseClass obj=new BaseClass();
	obj.BrowserLaunch();
	LoginPage loginpage=new LoginPage();    
	 loginpage.Login("Admin", "admin123");
	 HomePage homePage=new HomePage();
	 homePage.getMyInfolink().click();
	 MyInfoPage myInfoPage=new MyInfoPage();
	 myInfoPage.getMyInfoEditButtont();
	 myInfoPage.EditNameDetails("Test", "", "Test");
}
	
	
	
}
