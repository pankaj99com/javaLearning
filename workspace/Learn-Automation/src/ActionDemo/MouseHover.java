package ActionDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement wb= driver.findElement(By.xpath("//img[@alt='Google']"));
		Actions action=new Actions(driver);
		action.moveToElement(wb);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		action.perform();
		/*//WebElement wb1=driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value="I Feeling Lucky"]"));
		//action.sendKeys(Keys.ENTER).perform();
		//action.contextClick(wb1);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("selenium");

driver.findElement(By.xpath("//input[@type='submit']")).submit();

action.contextClick(wb1);
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);*/
	}

}
