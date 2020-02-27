import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLearning {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new FirefoxDriver();
driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
Thread.sleep(3000);
driver.findElement(By.xpath(".//button[text()='Add Element']")).click();
Thread.sleep(3000);

WebElement s1=driver.findElement(By.xpath("//button[text()='Delete']"));
String s2=s1.getText();
String expectedtext="Delete";
if(s2.equals(expectedtext)){
	System.out.println("Test case passed");
	
}else{
	System.out.println("Test case Failed");
}
driver.quit();

	}

}
