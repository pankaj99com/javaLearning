/**
 * 
 */
package HandingPopupsAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Pankaj.Kumar
 *
 */
public class AlertclassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium new jar\\firefox new\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		

	}

}
