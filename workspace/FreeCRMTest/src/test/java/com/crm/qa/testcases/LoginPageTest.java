package com.crm.qa.testcases;



import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	
	public LoginPageTest(){
		super();
		
	}
	
	@BeforeMethod()
	public void setup(){
		initialization();
		 loginpage=new LoginPage();
		}
	
	@Test(priority=1)
	
	public void validateloginpagetitleTest(){
		String title=loginpage.validateTitle();
		Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void validateCRMPROLogoTest(){
		
	boolean flag=loginpage.validateCRMPRO_Logo();
	Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void validateloginTest(){
		loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
	}
	
	
	
	@AfterMethod()
	public void teardown(){
		driver.quit();
		
	}
	
	
}
