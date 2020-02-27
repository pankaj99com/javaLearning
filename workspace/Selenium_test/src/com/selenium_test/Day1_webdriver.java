package com.selenium_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1_webdriver {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		String Title=driver.getTitle();
		System.out.println(Title);
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination

        File DestFile=new File("./screenshot.png");

        //Copy file at destination

           FileHandler.copy(src, DestFile);

		
		WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pankajcadbury@gmail.com");
		WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']")));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Cadbury@1307");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
        String TitleAfterLogin=driver.getTitle();
        System.out.println(TitleAfterLogin);
        
		List<WebElement> options=driver.findElements(By.xpath("//li[@id='js_n3']//div[@class='_1gyw _55lt']"));
		
		for(int i=0;i<options.size();i++){
			
			System.out.println(options.get(i).getText());
		}

	}

}
