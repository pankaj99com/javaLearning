package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: pankaj kumar')]")
	WebElement userNamelabel;
	
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath="//td[contains(text(),'Deals')]")
	WebElement 	DealsLink;
	
	@FindBy(xpath="//td[contains(text(),'Tasks')]")
	WebElement 	TasksLink;

public HomePage(){
		
		//Initialize the page objects:
		
	PageFactory.initElements(driver, this);
		
		}

public String verifyHomePageTitle()
{
	
	return driver.getTitle();
}

public ContactsPage ClickOnContactLink(){
	ContactsLink.click();
	return new ContactsPage();
}
	public DealsPage ClickOnDealsLink(){
		DealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage ClickOnTasksLink(){
		TasksLink.click();
		return new TasksPage();
	}
}

