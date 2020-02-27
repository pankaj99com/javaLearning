package DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
	
	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://www.gmail.com");
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println(title.length());
	String source=driver.getPageSource();
	System.out.println(source);
	}

}
