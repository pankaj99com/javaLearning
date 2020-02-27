package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void CaptureScreenshot(WebDriver driver,String SSname){
		
		try {
			TakesScreenshot ts = ((TakesScreenshot) driver);
			File src=ts.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination

			File DestFile=new File("./Screenshots/"+SSname+".png");

			//Copy file at destination

			   FileHandler.copy(src, DestFile);
			   System.out.println("Screenshot taken");
			   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		
		
	}
	
	
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	 
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	 
	}
	
}
