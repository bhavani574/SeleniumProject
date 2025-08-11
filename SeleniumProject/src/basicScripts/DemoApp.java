package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("BHAVANI S");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhavani.vani57@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		  driver.findElement(By.xpath("//input[@type='email']")).clear();
		  driver.findElement(By.xpath("//button[@type='submit']")).submit();
		  driver.quit();
		  }
		  
}
