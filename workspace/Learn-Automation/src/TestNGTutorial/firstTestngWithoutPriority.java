package TestNGTutorial;

import org.testng.annotations.Test;

public class firstTestngWithoutPriority {
	@Test
	public void login()
	{
		System.out.println(" Hey !! This is login method");
	}

	@Test
	public void setup()
	{
		System.out.println(" Hey !! This is setup method");
	}
	
	@Test
	public void closing()
	{
		System.out.println(" Hey !! This is close method");
	}
}
//order of execution is based on alphabatical order :close->login-->setup