package com.Accolite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Accolite.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void LoginAsManager() throws InterruptedException{
		driver.findElement(By.xpath(OR.getProperty("manager_login"))).click();
		Thread.sleep(5000);
	}

}
