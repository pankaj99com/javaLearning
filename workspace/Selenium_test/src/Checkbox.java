import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		Thread.sleep(3000);
		String Validate = ele.getAttribute("checked");

		System.out.print(Validate);

		ele.click();

		String Validate2 = ele.getAttribute("checked");
		System.out.println(Validate2);
		System.out.println(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected());
		boolean status = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected();

		if (status == true) {
			driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();
			System.out.println(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected());

		}

	}

}
