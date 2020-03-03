package TestNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	

	@Test
	public void setup() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
	}
}
