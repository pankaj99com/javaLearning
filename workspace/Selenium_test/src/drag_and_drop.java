import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import library.Utility;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(9000);
		WebElement Draggable = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement Droppable = driver.findElement(By.xpath("//*[@id='bank']/li"));

		Actions action = new Actions(driver);
		// action.dragAndDrop(Draggable,Droppable).build().perform();

		// both method are working

		action.clickAndHold(Draggable).moveToElement(Droppable).release().build().perform();

		Utility.CaptureScreenshot(driver, "DragDrop.png");
	}

}
