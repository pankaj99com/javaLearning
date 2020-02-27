import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import library.Utility;

public class ContextMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		actions.contextClick(elementLocator).perform();
		
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();
		Thread.sleep(5000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		// Accept the alert displayed
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		// Closing the driver instance
		driver.quit();
	}

}
