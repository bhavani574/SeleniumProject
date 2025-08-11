package basicScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize {public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	Dimension d= new Dimension (60,400);
	driver.manage().window().setSize(d);
	
	}

}

