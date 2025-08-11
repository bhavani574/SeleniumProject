package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkdropdown {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	Thread.sleep(2000);
	WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
	Select s = new Select(dropdown);
	s.selectByIndex(1);
	s.selectByValue("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
	s.selectByVisibleText("Mens Cotton Jacket...");
	
	Thread.sleep(200);
	s.deselectByIndex(1);
	s.deselectByValue("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
	s.deselectByVisibleText("Mens Cotton Jacket...");
	
	
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	if(s.isMultiple())
//	{
//		s.selectByIndex(1);
//		s.selectByValue("k");
//		s.selectByVisibleText("RamCharan");
//		Thread.sleep(2000);
//		
//		s.deselectByIndex(1);
//		s.deselectByValue("k");
//		s.deselectByVisibleText("RamCharan");
//	}
//	if(s.isMultiple())
//	{
//		System.out.println("It is a multiselect dropdown");
//	}
	//else
//	{
//		System.out.println("It is a single dropdown");
//	}
//	Thread.sleep(2000);
	//driver.quit();
	
