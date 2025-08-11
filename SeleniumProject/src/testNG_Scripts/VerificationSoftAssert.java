package testNG_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationSoftAssert {
		@Test
		public void verifyTitle()
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			String ExpectedTitle="Facebook log in or sign up";
			String ActualTitle=driver.getTitle();
			SoftAssert s=new SoftAssert();
			s.assertEquals(ExpectedTitle, ActualTitle);
			System.out.println("Execution is processed");
			driver.quit();
			s.assertAll();
			
		}
	}



