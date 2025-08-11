package mouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.flipkart.com/");
		  Actions a=new Actions(driver);
		 WebElement elctr=driver.findElement(By.xpath("//span[.='Electronics']"));
		 
		 
		 Thread.sleep(2000);
		 a.moveToElement(elctr).perform();
		 
		 
	}

}
