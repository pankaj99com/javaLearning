import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Utility;

public class Login {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		WebElement w1=driver.findElement(By.xpath("//input[@id='user_login']"));
		
		w1.sendKeys("demo");
		Utility.highLightElement(driver, w1);
		WebElement w2=driver.findElement(By.xpath("//input[@id='user_pass']"));
		Utility.highLightElement(driver, w2);
		w2.sendKeys("demo123");
		
		WebElement w3=driver.findElement(By.xpath("//input[@id='wp-submit']"));
		Utility.highLightElement(driver, w3);
		w3.click();
	}

}
