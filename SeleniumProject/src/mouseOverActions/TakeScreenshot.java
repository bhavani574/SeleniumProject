package mouseOverActions;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.fb.com/");
		  
		  
		  
//		  WebElement ele=driver.findElement(By.id("email"));///without using Takesscreenshot
//		  File temp=ele.getScreenshotAs(OutputType.FILE);
//		  File perm=new File("./Screenshot/Element1.png");
//		  FileHandler.copy(temp, perm);
//		  Thread.sleep(2000);
//		  driver.quit();
	}
}
//		  )
//		  Thread.sleep(2000);
// 		TakesScreenshot ts=(TakesScreenshot)driver;//1st step
//		  File temp=ts.getScreenshotAs(OutputType.FILE);//2nd step
//		  File perm=new File("./Screenshot/Defect1.png");
//		  FileHandler.copy(temp, perm);
//		  driver.quit();
//	  

