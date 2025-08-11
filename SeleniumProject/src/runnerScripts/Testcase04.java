package runnerScripts;

import org.testng.annotations.Test;

import baseScript.BasePage;
import pageObjects.LoginPage;

public class Testcase04 extends BasePage{
	@Test
	public void loginTestcase()
	{
	
		p.getUsn().sendKeys("Bhavani");
		p.getPass().sendKeys("Bhavani@1234");
		p.getLogin().click();
	}
	


}
