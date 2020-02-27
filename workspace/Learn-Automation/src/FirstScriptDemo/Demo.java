package FirstScriptDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium new jar\\firefox new\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("selenium");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		driver.wait();
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).click();
		
		driver.quit();
		

	}

}
