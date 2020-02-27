import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		WebElement ele=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select selection=new Select(ele);
		//selection.selectByIndex(1);
		//selection.deselectByVisibleText("Option 2");
        
		
		List<WebElement> options=selection.getOptions();
		
		for(int i=0;i<options.size();i++){
			
			System.out.println(options.get(i).getText());
		}
	}

}
