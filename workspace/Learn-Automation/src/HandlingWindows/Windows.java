package HandlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("HDFC Ltd")).click();
		String parent_windowid=driver.getWindowHandle();
		System.out.println(parent_windowid);
		System.out.println("TITLE:::Before  switch to child window");
		System.out.println(driver.getTitle());
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> I=s1.iterator();
		
		while(I.hasNext())
		{
			 String child_windowid =I.next();
			 System.out.println(child_windowid);
			 if(!parent_windowid.equalsIgnoreCase(child_windowid)){
				 driver.switchTo().window(child_windowid);
			Thread.sleep(20000);
			System.out.println("TITLE:::After the switch to child window");
			System.out.println(driver.getTitle());
			driver.close();
			 }
		}
driver.switchTo().window(parent_windowid);
System.out.println("Title:Back to parent window ------  "+driver.getTitle());
	}

}
