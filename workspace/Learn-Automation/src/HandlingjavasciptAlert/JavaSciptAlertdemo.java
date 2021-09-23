package HandlingjavasciptAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaSciptAlertdemo {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.gecko.driver", "C:\\selenium new jar\\firefox new\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/javasciptalert.txt.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/button")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert title is"+alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
	}

}
