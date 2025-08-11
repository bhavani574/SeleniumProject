package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script09 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/admin/Desktop/selenium/SampleSourcecode1.html");
		  driver.findElement(By.cssSelector("input[id='u1'])")).sendKeys("Bhavani");
		  driver.findElement(By.cssSelector("input[name='p1'])")).sendKeys("123456");
		  driver.findElement(By.cssSelector("input[type='radio'])")).click();
		  driver.findElement(By.cssSelector("input[type='checkbox'])")).click();
		  driver.findElement(By.cssSelector("a[href='https://www.fb.com']")).click();
	}
		 
}
