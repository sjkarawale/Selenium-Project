package com.abc.nexttestcases;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.pages.LoginPageWithPageFactory;
import com.abc.utility.BaseClass;
import com.abc.utility.WaitConditions;

@Test
public class NewLoginPageTestCases {
    public void TC1() {
    	BaseClass obj=new BaseClass();
		obj.BrowserLaunch();
		LoginPageWithPageFactory loginpage=new LoginPageWithPageFactory();
        loginpage.Login("Admin", "admin");
        if(BaseClass.driver.findElement(By.id("spanMessage")).isDisplayed()) {
		      System.out.println("User is unable to login with invalid credentials");
	    }else {
		      System.out.println("Testcase is Fail as User is able to login with invalid credentials");
        }
	}
    
    public void TC2 () {
    	LoginPageWithPageFactory loginpage=new LoginPageWithPageFactory();
    	 //driver is static variable 
	    loginpage.Login("Admin", "admin123");
	    //Explicit Wait
	    WaitConditions.WaitforClick(BaseClass.driver.findElement(By.id("menu_dashboard_index")));
	   // WebDriverWait wait= new WebDriverWait(BaseClass.driver,10);
	  //  wait.until(ExpectedConditions.elementToBeClickable(BaseClass.driver.findElement(By.id("menu_dashboard_index"))));
       if(BaseClass.driver.findElement(By.id("menu_dashboard_index")).isDisplayed()) {
	        System.out.println("USer is succesfully able to login with valid credential");
       }else {
	        System.out.println("USer is unable to login with valid credential");
       }
     }
    @AfterMethod
    public void Aftermethod() {
    	HomePage homePage=new HomePage();
    	if(homePage.getLogoutbutton().size()>0) {
    		homePage.getProfilelink().get(0).click();
    		//Click on the button if it is present
    		//we search by findelements-->It will not throw no such element
    		//line 52 criteria --> if size is more than 0 then only click
    		homePage.getLogoutbutton().get(0).click();
    	}
    
    	
    		
    	}
    }
   
	
	
