package baseScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.LoginPage;

public class BasePage {
	public WebDriver driver;
	public LoginPage  p;
	@BeforeMethod
	public void LaunchBroswer()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		   p=new LoginPage (driver);
	}
	@AfterMethod
	public void closeBroswer()
	{
		driver.quit();
	}
	
	

}
