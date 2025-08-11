package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.cssSelector("input[name='email']")).sendKeys("bhavani.com");
		  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		  driver.findElement(By.cssSelector("button[name='login']")).click();
		  Thread.sleep(2000);
		  
		  
	}
}
