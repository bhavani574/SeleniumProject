package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutClear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(2000);
		  driver.navigate().to("file:///C:/Users/admin/Desktop/selenium/Script.html");
		  WebElement ele1=driver.findElement(By.id("u1"));
		  WebElement ele2=driver.findElement(By.name("p1"));
		  WebElement ele3=driver.findElement(By.name("e1"));
		  Thread.sleep(2000);
		  ele1.sendKeys(Keys.CONTROL+"a");
		  Thread.sleep(2000);
		  ele1.sendKeys(Keys.CONTROL+"x");
		  Thread.sleep(2000);
		  ele3.sendKeys(Keys.CONTROL+"v");
		 // ele3.sendKeys(Keys.BACK_SPACE);
		  
		  
		  Thread.sleep(2000);
		  ele2.sendKeys(Keys.CONTROL+"a");
		  Thread.sleep(2000);
		  ele2.sendKeys(Keys.CONTROL+"x");
		  Thread.sleep(2000);
		  ele1.sendKeys(Keys.CONTROL+"v");
		  Thread.sleep(2000);
		  
		  Thread.sleep(2000);
		  ele3.sendKeys(Keys.CONTROL+"a");
		  Thread.sleep(2000);
		  ele3.sendKeys(Keys.CONTROL+"x");
		  Thread.sleep(2000);
		  ele2.sendKeys(Keys.CONTROL+"v");
		  
		  driver.quit();
		  
		  
		  
		  
		  
	}

}
