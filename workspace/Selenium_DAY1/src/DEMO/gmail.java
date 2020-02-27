package DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		String title=driver.getTitle();
        System.out.println(title);
        
        driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("pankaj99.com@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.close();
	}

}
