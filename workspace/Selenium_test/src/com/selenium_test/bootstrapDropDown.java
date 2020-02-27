package com.selenium_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapDropDown {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/#examples");
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown button')]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement list=driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][contains(text(),'Action')]"));
		list.click();
		//System.out.println(list.getText());
		

	}

}
