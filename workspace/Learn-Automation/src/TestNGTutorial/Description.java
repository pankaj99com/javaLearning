package TestNGTutorial;

import org.testng.annotations.Test;

public class Description {
	@Test(priority=1,description="this is login method")
	public void login()
	{
		System.out.println(" Hey !! This is login method");
	}

	@Test(priority=2,description="this is setup method")
	public void setup()
	{
		System.out.println(" Hey !! This is setup method");
	}
	
	@Test(priority=3,description="this is Closing method")
	public void closing()
	{
		System.out.println(" Hey !! This is close method");
	}
}
//order of execution is based on alphabatical order :close->login-->setup