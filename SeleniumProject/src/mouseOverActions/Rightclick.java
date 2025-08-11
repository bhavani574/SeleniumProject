package mouseOverActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.flipkart.com/");
	  Actions a=new Actions(driver);
	  WebElement ele=driver.findElement(By.xpath("//span[.='Kilos']"));
	  Robot r=new Robot();
	  a.contextClick(ele).perform();
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	
	  WebElement ele1=driver.findElement(By.xpath("//span[.='Mobiles']"));
	  a.contextClick(ele1).perform();
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  
	  WebElement ele2=driver.findElement(By.xpath("//span[.='Appliances']"));
	  a.contextClick(ele2).perform();
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  
	  WebElement ele3=driver.findElement(By.xpath("//span[.='Flight Bookings']"));
	  a.contextClick(ele3).perform();
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(2000);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_TAB);
	  
	  
	  
	  
	  
	  
	  }
}
