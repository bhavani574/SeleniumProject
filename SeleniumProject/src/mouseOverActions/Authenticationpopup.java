package mouseOverActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://admin:admin11@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	  Thread.sleep(2000);
	}

}
