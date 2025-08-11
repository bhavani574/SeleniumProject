package testNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTask {
	@Test
	public void VerifyTestCase() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.fb.com");
		WebElement usn=driver.findElement(By.id("email"));
		usn.sendKeys("BHAVANI");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("Bhavani@123");
		Thread.sleep(2000);
		driver.navigate().refresh();
		usn.sendKeys("BHAVANI");
		pwd.sendKeys("Bhavani@123");
		driver.quit();
		
		
		
	}

}
