package mouseOverActions;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrollbar {
	public static void main(String[] args) throws  InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.netflix.com/in/");
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,750)");
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(2000);
		  
		  WebElement ele=driver.findElement(By.xpath("(//div[@class='form-control_controlWrapperStyles__oy4jpq1'])[3]"));
		  File temp=ele.getScreenshotAs(OutputType.FILE);
		  File perm=new File("./Screenshot/Section1.png");
		  FileHandler.copy(temp, perm);
		  Date d=new Date();
		  String d1=d.toString();
		  String d2=d1.replace(":", "-");
		  System.out.println(d2);
		  
		  driver.quit();
		  
		  
		  
		  
	}
		  
		  
		  

}
