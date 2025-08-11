package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/admin/Desktop/selenium/SampleSourcecode1.html");
		  driver.findElement(By.linkText("facebook2025")).click();

	}
}
