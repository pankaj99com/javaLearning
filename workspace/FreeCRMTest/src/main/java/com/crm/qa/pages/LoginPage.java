package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory OR
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignupLink;
	
	@FindBy(xpath="//a[@href='https://www.crmpro.com/index.html']")
	WebElement CRMPRO_Logo;
	
	
	public LoginPage(){
		
		//Initialize the page objects:
		
	PageFactory.initElements(driver, this);
		
		}
	
	public String validateTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMPRO_Logo(){
		return CRMPRO_Logo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd){
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		
		return new HomePage();
		
		
		
		
	}
	

}

