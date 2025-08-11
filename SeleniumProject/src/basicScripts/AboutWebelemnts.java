package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutWebelemnts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.fb.com/");
		 WebElement usn= driver.findElement(By.id("email"));
		 if(usn.isDisplayed())
			{
			 	System.out.println("the usn is displayed");	
			 	if(usn.isEnabled())
		 		{
		 			System.out.println("the usn is enabled");
		 			if(usn.isSelected())
		 			{
		 				System.out.println("the usn is selected");
		 			}
		 			else
		 			{
		 				System.out.println("the usn is not enabled");
		 			}
		 		}
			 	else
			 	{
			 		System.out.println("the usn is not selected");
			 	}
			 	
			}
		 else
		 {
			 System.out.println("the usn is not displayed");
		 }
		driver.quit();	 		
	}
}
			 			
			 		