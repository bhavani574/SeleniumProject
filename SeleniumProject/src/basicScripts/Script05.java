package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/admin/Desktop/selenium/SampleSourcecode1.html");
		  driver.findElement(By.tagName("a")).click();
		  //Thread.sleep(2000);
		  //driver.quit();
		
	}
}
