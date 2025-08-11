package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
//These below is flipkart execution
//		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
//		  WebDriver driver=new FirefoxDriver();
//		  driver.get("https://www.flipkart.com/");
//		  WebElement dropdown=driver.findElement(By.xpath("//img[@alt='Chevron']"));
//		  dropdown.click();
//		  Thread.sleep(2000);
//		  WebElement cart=driver.findElement(By.cssSelector("a[href='/viewcart?exploreMode=true&preference=FLIPKART']"));
//		  Thread.sleep(2000);
//		  cart.click();
//		  
//		  WebElement login=driver.findElement(By.xpath("//span[.='Login']"));
//		  login.click();
//	}
//}
//		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		  
		  
		  
		  
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636"); 
		 
		  Thread.sleep(2000);
		  WebElement name=driver.findElement(By.id("name"));
		  name.sendKeys("BHAVANI S");
		  Thread.sleep(2000);
		  
		  WebElement email=driver.findElement(By.name("email"));
		  email.sendKeys("bhav7512@gamil.com");
		  WebElement password=driver.findElement(By.id("password"));
		  password.sendKeys("BHAVANI123");
		  WebElement mobile=driver.findElement(By.id("mobile"));
		  mobile.sendKeys("9876578009");
		  WebElement experience=driver.findElement(By.xpath("//p[.='  I have work experience (excluding internships)']"));
		  experience.click();
		  WebElement reg=driver.findElement(By.xpath("//button[.='Register now']"));
		  reg.click();
		  
		  
	}
		  

}
