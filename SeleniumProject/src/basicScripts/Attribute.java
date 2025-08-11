package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.fb.com/");
	 WebElement usn= driver.findElement(By.name("email"));
	 String av=usn.getAttribute("data-testid");
	 System.out.println(av);
	 driver.quit();
	}


}
