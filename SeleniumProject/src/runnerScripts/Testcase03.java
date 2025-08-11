package runnerScripts;

import org.testng.annotations.Test;

import baseScript.BasePage;

public class Testcase03 extends BasePage{
	@Test
	public void checkUsn()
	{
		System.out.println(p.getUsn().isDisplayed());
	}
}
