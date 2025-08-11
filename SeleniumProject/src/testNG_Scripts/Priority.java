package testNG_Scripts;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	
	public void Signup()
	{
		System.out.println("Successfully signedup");
	}
	
	@Test(priority=2)
	
	public void login()
	{
		System.out.println("Successfully login");
	}
	@Test(priority=3)
	
	public void homepage()
	{
		System.out.println("Successfully homepage");
	}
	
	@Test(priority=4)
	
	public void Profile()
	{
		System.out.println("Successfully accessed to profile");
	}
	@Test(priority=5)
	
	public void logout()
	{
		System.out.println("Successfully logout");
	}
	

}
