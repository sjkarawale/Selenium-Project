package com.abc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClass;

public class MyInfoPage {

	//POM with pagefactory- Part 1
	//edit Button locator
	
	@FindBy(id="btnSave")
	WebElement  editbutton;
	
	@FindBy(id="personal_txtEmpFirstName")
	WebElement  FirstNametxt;
	
	@FindBy(id="personal_txtEmpMiddaleName")
	WebElement  MiddaleNametxt;
	
	@FindBy(id="personal_txtEmpLastName")
	WebElement  LastNametxt;
	
	@FindBy(id="btnSave")
	WebElement  Savebutton;
	
	
	
	  //POM with pagefactory- Part 2
        public MyInfoPage() {
		   PageFactory.initElements(BaseClass.driver, this);
		}
        
        public WebElement getMyInfoEditButtont() {
 		   return editbutton;
 			}
		public WebElement getMyInfoFirstNametxt() {
			return FirstNametxt;
			}
		
		
		public WebElement getMyInfoMiddleNametxt() {
		   return MiddaleNametxt;
			}
		
		
		public WebElement getMyInfoLastNametxt() {
			return LastNametxt;
			}
		
		public WebElement getMyInfoSavebtn() {
			return Savebutton;
			}
		
		
		//Below method will applicable to modify the Name details
		
		public void EditNameDetails(String FirstName,String MiddleName ,String LastName) {
			getMyInfoFirstNametxt().sendKeys(FirstName);
			getMyInfoLastNametxt().sendKeys(LastName);
			getMyInfoMiddleNametxt().sendKeys(MiddleName);
            getMyInfoSavebtn().click();
			
		}
		
		
		
		
		
		
		
		
		
}
