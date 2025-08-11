package tekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingonActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		  Actions a=new Actions(driver);
//		  WebElement fashion=driver.findElement(By.xpath("//span[.='Fashion']"));
//		  a.moveToElement(fashion).perform();
		  WebElement rome=driver.findElement(By.id("box6"));
		  WebElement italy=driver.findElement(By.id("box106"));
		  Thread.sleep(2000);
		  a.clickAndHold(rome).moveToElement(italy).perform();
		  

		  Thread.sleep(2000);
		  driver.quit();
		  
	}

}
