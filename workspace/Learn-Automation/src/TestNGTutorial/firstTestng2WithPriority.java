package TestNGTutorial;

import org.testng.annotations.Test;

public class firstTestng2WithPriority {
	@Test(priority=1)
	public void login()
	{
		System.out.println(" Hey !! This is login method");
	}

	@Test(priority=2)
	public void setup()
	{
		System.out.println(" Hey !! This is setup method");
	}
	
	@Test(priority=-3)
	public void closing()
	{
		System.out.println(" Hey !! This is close method");
	}
}
//order of execution is based on alphabatical order :close->login-->setup

//After adding priority we can arrange executions based on priorty.
//Testng Also supports negative values as priority.priority=-3