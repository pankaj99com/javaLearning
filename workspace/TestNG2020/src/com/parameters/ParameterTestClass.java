package com.parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParameterTestClass {
	
	WebDriver driver;
	
	@Test
	public void yahoologinTest() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
	}

}
