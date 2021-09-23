import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DisappearingElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		int n=1;
		
		while (n < 5) {

			driver.get("http://the-internet.herokuapp.com/disappearing_elements");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Portfolio']")).click();
			n++;
		}
	}

}
