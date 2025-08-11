package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.jio.com/");
		  driver.findElement( By.xpath("//a[@aria-label='Mobile']")).click();
		  driver.findElement(By.xpath("//div[contains(text(),'Recharge')]")).click();
		  driver.findElement(By.xpath("//input[@id='submitNumber']")).sendKeys("8618510718");	
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@style='flex-basis: unset;']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[.='Buy']")).click();
		  
	}

}
