package mouseOverActions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollParticularelement {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/scroll/newTabVertical");//enter the url
		  Thread.sleep(2000);
		  WebElement ele=driver.findElement(By.xpath("//h3[.='Free Materials']"));
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  Thread.sleep(2000);
		  js.executeScript("arguments[0].scrollIntoView()",ele);
	}

}
