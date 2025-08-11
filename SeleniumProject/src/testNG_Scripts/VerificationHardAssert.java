package testNG_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationHardAssert {
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		String ExpectedTitle="Facebook – log in or sign up";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Execution is processed");
		driver.quit();
		
	}
}
