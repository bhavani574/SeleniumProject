package mouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingdisabledbyArgu {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("file:///C:/Users/admin/Desktop/selenium/SampleSourcecode1.html");//enter the url
	  WebElement ele=driver.findElement(By.name("username"));
	  Thread.sleep(2000);
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  Thread.sleep(2000);
	  js.executeScript("document.getElementById('u1').value='Amazon'");//by using document
	  Thread.sleep(2000);
	  js.executeScript("document.getElementById('u1').value=''");//by using document
	  Thread.sleep(2000);
	  js.executeScript("arguments[0].value='Download'",ele);//by using argument
	  Thread.sleep(2000);
	  js.executeScript("arguments[0].value=''",ele);//by using argument

	  
}

}
