package com.abc.nexttestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.pages.MyInfoPage;
import com.abc.testcases.LoginPageTestCases;

public class HomePageTestCases {

	public class HomepageTestCases extends LoginPageTestCases{
		
		
		@BeforeClass
		public void LoginPageTestCases() {
			LoginPage loginPage=new LoginPage();
			loginPage.Login("Admin" ,"admin123");
		}
	
	@Test(priority=3)
	public void TC3() throws ClassNotFoundException{
		LoginPage loginPage=new LoginPage();
		loginPage.Login("Admin" ,"admin123");
		HomePage homePage=new HomePage();
		homePage.getProfilelink().click();
		MyInfoPage myInfoPage=new MyInfoPage();
		myInfoPage.getMyInfoEditButton().click();
		myInfoPage.EditNameDetails("Test","","Test");
		
	}
	
	}
	
}
