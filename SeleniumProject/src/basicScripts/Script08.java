package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script08 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/admin/Desktop/selenium/SampleSourcecode1.html");
		  driver.findElement(By.id("l1")).sendKeys("Bhavani S");
		  driver.findElement(By.name("p1")).sendKeys("123456");
		  driver.findElement(By.className("C1")).click();
		  
	}

}
