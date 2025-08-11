package mouseOverActions;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBottom {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/scroll/newTabVertical");//enter the url
		  Thread.sleep(2000);
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll the page to bottom
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//scroll the page to top
	}

}
