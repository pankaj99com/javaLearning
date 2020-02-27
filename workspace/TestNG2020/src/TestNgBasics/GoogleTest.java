package TestNgBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
	}
	@Test(priority=1,groups="Title")
	public void googleTitleTest(){
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test(priority=2,groups="Logo Test")
	public void googlelogoTest(){
		boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=4,groups="mail test")
	public void googleMailTest(){
		boolean b1=driver.findElement(By.linkText("Mail")).isDisplayed();
		System.out.println(b1);
	}
	@Test(priority=3,groups="link test")
	public void googlelinkTest(){
		boolean b1=driver.findElement(By.xpath("//a[@class='Fx4vi'][contains(text(),'Privacy')]")).isDisplayed();
		System.out.println(b1);
	}
	@Test(priority=5,groups="search")
	public void googlelSearch(){
		driver.findElement(By.xpath("//div[@class='SDkEP']")).sendKeys("Testing");
	}
	
	@Test(priority=6,groups="link test")
	public void findlinks(){
		List<WebElement> li=driver.findElements(By.tagName("a"));	
		System.out.println("Total links ="+li.size());
			for(int i=0;i<li.size();i++){
				System.out.println(li.get(i).getText());
	}
	}
	@AfterMethod
	public void tearDown(){
	driver.quit();
}
}
