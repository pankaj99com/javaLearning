package AutoCompleteEditBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoCompleteEditBoxDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("tags")).sendKeys("h");
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("h");
		List<WebElement> li = driver.findElements(By.xpath(".//*[@id='tags']"));
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());

		}
	}

}
