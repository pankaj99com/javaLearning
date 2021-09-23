package TestNgPractice;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Pankaj.Kumar
 *
 */
public class OrtderOfExecution {
     @Test(priority=1)
	public void login(){
		System.out.println("This will execute first");
	}
     @Test(priority=2)
 	public void click(){
    	 System.out.println("This will execute second ");
 	}
     @Test(priority=3)
 	public void tear(){
    	 System.out.println("This will execute last");
 	}
}
