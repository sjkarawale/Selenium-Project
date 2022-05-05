package com.abc.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abc.pages.ForgotPasswordPage;
import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.utility.BaseClass;
import com.abc.utility.WaitConditions;

public class LoginPageTestCases extends BaseClass {
	/*
	 * open the browser with url
	 * Enter valid credential and click on the login button 
	Open the browser with url
	Enter valid Username
	       Selenium- find the element and perform the operation 
	       Finding the element -Locatory
	       Sendkeys
	Enter valid Password 
	       Finding the element
	       Sendkeys
	Click on login button
	  Finding the element
	       click
	       Expected Result -->User should be login
	*/
	public static void main(String[] args) throws InterruptedException {
		BaseClass obj=new BaseClass();
		obj.BrowserLaunch();
		
		//LoginPageWithFactory loginpage=new LoginPageWithFactory();
		//loginpage.Login("Admin", "admin");

	  LoginPage loginpage=new LoginPage();
		ForgotPasswordPage forgotpassword=new ForgotPasswordPage();
        
	   loginpage.Login("Admin", "admin");
        if(BaseClass.driver.findElement(By.id("spanMessage")).isDisplayed()) {
		      System.out.println("User is unable to login with invalid credentials");
	    }else {
		      System.out.println("Testcase is Fail as User is able to login with invalid credentials");
        }
	
	  //driver is static variable 
	    loginpage.Login("Admin", "admin123");
	    //Explicit Wait
	    WaitConditions.WaitforClick(BaseClass.driver.findElement(By.id("menu_dashboard_index")));
	   // WebDriverWait wait= new WebDriverWait(BaseClass.driver,10);
	   // wait.until(ExpectedConditions.elementToBeClickable(BaseClass.driver.findElement(By.id("menu_dashboard_index"))));
       if(BaseClass.driver.findElement(By.id("menu_dashboard_index")).isDisplayed()) {
	        System.out.println("USer is succesfully able to login with valid credential");
       }else {
	        System.out.println("USer is unable to login with valid credential");
       }
       
       //Get My info
       HomePage test=new HomePage();
       test.getMyInfolink();
       
       forgotpassword.Forgot("Forgot your password");
       if( BaseClass.driver.findElement(By.id("securityAuthentication_userName")).isDisplayed()) {
	        System.out.println("Forgot your password navigate Succesfully");
       }else {
	        System.out.println("Forgot your password link unable to navigate");
       }
	
	}
	
}
