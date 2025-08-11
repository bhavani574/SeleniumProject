package runnerScripts;

import org.testng.annotations.Test;

import baseScript.BasePage;

public class Testcase01 extends BasePage
{
	@Test
	public void fetchTitle()
	{
		System.out.println(driver.getTitle());
	}

}
