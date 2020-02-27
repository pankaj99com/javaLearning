package TestNgBasics;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest(){
		System.out.println("Login test");
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("Home Page test");
	}
}
