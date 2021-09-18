package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDropdown {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\selenium new jar\\firefox new\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> drop_down=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(int i=0;i<drop_down.size();i++){
		WebElement w=drop_down.get(i);
		String innerhtml=w.getAttribute("innerHTML");
		System.out.println("Values from drop down is ----"+innerhtml);
		
		}
		drop_down.get(2).click();
	}

}
