package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();	
		System.out.println(url);
		driver.quit();
		
		
//		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
//		WebDriver driver1=new FirefoxDriver();
//		driver1.get("https://www.flipkart.com");
//		String title1=driver1.getTitle();
//		System.out.println(title1);
//		String url1=driver1.getCurrentUrl();	
//		System.out.println(url1);
//		driver1.quit();
		
		}
}
