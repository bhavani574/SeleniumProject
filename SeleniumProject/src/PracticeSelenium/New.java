package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	private static final String Hyderabad = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@role='searchbox'and @aria-controls='pr_id_1_list']")).sendKeys(Hyderabad);
		
		
		
		
		
		
		
//		String title=driver.getTitle();
//		System.out.println(title);
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		driver.quit();		
	}

	private static void sendKeys(String hyderabad2) {
		// TODO Auto-generated method stub
		
	}
			

}
