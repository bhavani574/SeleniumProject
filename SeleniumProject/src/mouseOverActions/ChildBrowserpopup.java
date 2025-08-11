package mouseOverActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		  Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[.='Shop Now']")).click();
//		 Set<String> win=driver.getWindowHandles();
//		 for(String wins:win)
//		 {
//			 System.out.println(wins);
//		 }
//		 String p=driver.getWindowHandle();
//		 String parent=driver.getWindowHandle();
//		 Set<String> win=driver.getWindowHandles();
//		 for(String wins:win) 
//		 {
//			 WebDriver tab=driver.switchTo().window(wins);
//			 System.out.println(tab.getTitle());
//			 if(parent.equals(wins))
//			 {
//				 tab.close();
//			 }
//		 }
		 
//		 String p=driver.getWindowHandle();
//		 String parent=driver.getWindowHandle();
//		 Set<String> win=driver.getWindowHandles();
//		 for(String wins:win) 
//		 {
//			 WebDriver tab=driver.switchTo().window(wins);
//			 System.out.println(tab.getTitle());
//			 if(!parent.equals(wins))
//			 {
//				 tab.close();
//			 }
//	 }
		 
		 Set<String> win=driver.getWindowHandles();
		 for(String wins:win)
		 {
			 WebDriver tab=driver.switchTo().window(wins);
			 System.out.println(tab.getTitle());
			 Thread.sleep(2000);
			 tab.close();
		 }
			 
		 
	}
		  

}
