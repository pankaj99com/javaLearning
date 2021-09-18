package MouseHovering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws Exception {
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		// System.setProperty("webdriver.gecko.driver", "C:\\selenium new
		// jar\\firefox new\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
				+ "/table/tbody/tr/td" + "/table/tbody/tr"));

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		Thread.sleep(5000);
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverHome.perform();
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		driver.close();
	}
}
