package com.abc.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;


public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	/*Purpose - this method will help to launch Firefox and chrome 
	 * Edge browser for specific application  
     */
	public void BrowserLaunch() {
		ReadProperties();

		if(prop.getProperty("BrowserName").equalsIgnoreCase("chrome")) {  //Condition weather browser is chrome
		     System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
             driver=new ChromeDriver();
		}
		
		else if(prop.getProperty("BrowserName").equalsIgnoreCase("edge")) {  //Condition weather browser is Edge
	         System.setProperty("webdriver.edge.driver","Resources/msedgedriver.exe");
             driver=new EdgeDriver();
		}
	
		else if(prop.getProperty("BrowserName").equalsIgnoreCase("gecko")) {  //Condition weather browser is Firefox
	         System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
		     driver=new FirefoxDriver();
		}
		   driver .get(prop.getProperty("Url"));
		   driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("defaultwait")),TimeUnit.SECONDS);
	                                 
	}
	@AfterSuite
	public void browserclose() {
		driver.close();
	}
	public void ReadProperties() {
		
		 prop=new Properties();
		try {
			prop.load(new FileInputStream("Resources\\Config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
		
}
