import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxesAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < ele.size(); i++) {

			System.out.println(ele.get(i).isSelected());
			boolean status = ele.get(i).isSelected();
			if (status == true) {
				ele.get(i).click();

			}

		}
		for (int i = 0; i < ele.size(); i++) {

			System.out.println(ele.get(i).isSelected());

		}

	}
}
