package TestNgPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Pankaj.Kumar
 *
 */
public class CheckElementIsDisplayed {
	@Test
	public void login(){
		
	
	//System.setProperty("webdriver.gecko.driver", "C:\\selenium new jar\\firefox new\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
  driver.get("https://google.com");
  driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
  
	int  flag=0;
	if(flag==0){
	System.out.println(driver.findElement(By.xpath("//img[@alt='Google']")).getAttribute("alt"));
		driver.findElement(By.xpath("//img[@alt='Google']")).click();
		System.out.println("logo clicked");
	}
	else
	{
		System.out.println("element not visible");
	}
	}
}
