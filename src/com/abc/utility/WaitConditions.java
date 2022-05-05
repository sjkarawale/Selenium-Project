package com.abc.utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.http.impl.cookie.IgnoreSpec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitConditions {
	
	
	//Specific Condition--Explicit wait
	//WeddriverWait And fluent Wait
	public static void WaitforClick(WebElement element) {
		WebDriverWait wait=new WebDriverWait (BaseClass.driver,Integer.parseInt(BaseClass.prop.getProperty("expectedconditionwait")));
		wait.until(ExpectedConditions.elementToBeClickable(element));		
		
	}
	public static void WaitforTitle(String Pagetitle) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(BaseClass.driver);
		wait.withTimeout(Duration.ofSeconds(Integer.parseInt(BaseClass.prop.getProperty("expectedconditionwait"))));
		wait.until(ExpectedConditions.titleContains(Pagetitle));
	}
	
	public static void WaitforEnable(WebElement element) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(BaseClass.driver)
		.withTimeout(Duration.ofSeconds(Integer.parseInt(BaseClass.prop.getProperty("expectedconditionwait"))))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	 
	public static void ElementPresent(WebElement element) {
		WebDriverWait wait=new WebDriverWait (BaseClass.driver,Integer.parseInt(BaseClass.prop.getProperty("expectedconditionwait")));
        wait.until(new ExpectedCondition<Boolean>() {

			//it return non-primitive data type
			public Boolean apply(WebDriver driver) {
				
				return true;
			}
		});
	
	/*//public static void ElementPresent(WebElement element) {
		FluentWait wait1=new FluentWait (BaseClass.driver);
        wait1.until(new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver arg0) {
				
				return element;
			}
		});*/
	}
	}
	
