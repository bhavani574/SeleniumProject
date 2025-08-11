package mouseOverActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImpicitWait {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.selenium.dev/downloads/");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement ele=driver.findElement(By.xpath("//img[@class='w-100 shadow-1-strong rounded']"));
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView()",ele);
		  
		  WebElement x1=driver.findElement(By.xpath("//p[.='.NET/C#']"));
		  WebElement x2=driver.findElement(By.xpath("//p[.='Ruby']"));
		  WebElement x3=driver.findElement(By.xpath("//p[.='Python']"));
		  WebElement x4=driver.findElement(By.xpath("//p[.='JavaScript']"));
		  ArrayList<WebElement> links=new ArrayList<WebElement>();
		  links.add(x4);
		  links.add(x3);
		  links.add(x2);
		  links.add(x1);
		  Robot r=new Robot();
		  Actions a=new Actions(driver);
		  for(WebElement l:links)
		  {
			  a.contextClick(l).perform();
			  r.keyPress(KeyEvent.VK_DOWN);
			  r.keyRelease(KeyEvent.VK_DOWN);
			  
			  r.keyPress(KeyEvent.VK_ENTER);
			  r.keyRelease(KeyEvent.VK_ENTER);
		  }
		 Set<String>win =driver.getWindowHandles();
		 for(String W:win)
		 
			 webDriver tab=driver.switchTo().window(W);
		 
		 }
		  
		  
		  
	}

}
