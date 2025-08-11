package testNG_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvovationCount {
		@Test(invocationCount=2)
		
		public void FacebookLogin()
		{
			System.out.println("Hello");
			
		}
		

	}
