package mouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notificationpopup {
	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeOptions opts=new ChromeOptions();
		//opts.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 // WebDriver driver=new ChromeDriver(opts);
		
			FirefoxOptions opts =new FirefoxOptions();
			opts.addPreference("dom.webnotifications.enabled",false);
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver(opts);
			
			driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		  Thread.sleep(2000);
		  WebElement button=driver.findElement(By.id("browNotButton"));
		  Thread.sleep(2000);
		  button.click();
		  System.out.println("execution is success");
	}

}
