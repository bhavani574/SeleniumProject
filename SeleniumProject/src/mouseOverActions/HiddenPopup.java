package mouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.redbus.in/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='dateWrapper___536b48']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[.='19']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@aria-label='button']")).click();
		  
	}


}
