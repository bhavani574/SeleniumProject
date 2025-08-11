package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("women dress");
		 driver.findElement(By.cssSelector(" button[type='submit']")).click();	
		 driver.findElement(By.cssSelector ("img[src='https://rukminim2.flixcart.com/image/612/612/xif0q/dress/g/5/e/xs-j0006-set-in-janasya-original-imah887hxtryk7zn.jpeg?q=70']")).click();
		  }

}
