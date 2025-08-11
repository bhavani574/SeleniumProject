package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesaDesign {
	@Test
	public void frames()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/New%20folder/Main.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("u1")).sendKeys("Admin");
		driver.findElement(By.name("psw")).sendKeys("Admin@123");
		driver.switchTo().frame("f2");
		driver.findElement(By.name("cpsw")).sendKeys("Admin@123");
		
		
		
		
	}

}
