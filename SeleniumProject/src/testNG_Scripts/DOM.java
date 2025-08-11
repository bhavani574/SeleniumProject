package testNG_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DOM {
	@Test
	
	public void Signup()
	{
		System.out.println("Successfully signedup");
	}
	
	@Test(dependsOnMethods="Signup")
	
	public void login()
	{
		System.out.println("Successfully login");
	}
	@Test(dependsOnMethods="login")
	
	public void homepage()
	{
		Assert.fail();
		System.out.println("Successfully homepage");
	}
	
	@Test(dependsOnMethods="homepage")
	
	public void Profile()
	{
		System.out.println("Successfully accessed to profile");
	}
	@Test(dependsOnMethods="Profile")
	
	public void logout()
	{
		System.out.println("Successfully logout");
	}
	

}
