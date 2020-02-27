package HandlingBootstrap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBootstrap {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium new jar\\firefox new\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.goibibo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='get_sign_up']")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("8431688940");
	}

}
