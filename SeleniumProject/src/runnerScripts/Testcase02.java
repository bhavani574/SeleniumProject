package runnerScripts;

import org.testng.annotations.Test;

import baseScript.BasePage;

public class Testcase02 extends BasePage{
	@Test
	public void fetchCurrentUrl()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	

}
