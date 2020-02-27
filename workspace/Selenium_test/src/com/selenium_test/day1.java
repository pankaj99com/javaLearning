package com.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Utility;

public class day1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
		Utility.CaptureScreenshot(driver,"brower");
		List<WebElement> options=driver.findElements(By.xpath("//select[@name='country']"));
		
		
		for(int i=0;i<options.size();i++){
			
			System.out.println(options.get(i).getText());
			
			
		}
		
	
	}
}
