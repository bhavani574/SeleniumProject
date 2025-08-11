package testNG_Scripts;

import org.testng.annotations.Test;

public class Enabled {
	@Test
	
	public void Signup()
	{
		System.out.println("Successfully signedup");
	}
	
	@Test(enabled=false)
	
	public void login()
	{
		System.out.println("Successfully login");
	}
	
	
	

}
