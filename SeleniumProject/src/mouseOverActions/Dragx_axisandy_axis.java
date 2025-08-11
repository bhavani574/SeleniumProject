package mouseOverActions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragx_axisandy_axis {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		  Thread.sleep(2000);
		 Actions a=new Actions(driver);
		 WebElement ele= driver.findElement(By.xpath("(//div[.='Drag Me'])[5]"));
		 Thread.sleep(2000);
		 a.clickAndHold(ele).moveByOffset(-137, -63).release(ele).perform();
	}

}
