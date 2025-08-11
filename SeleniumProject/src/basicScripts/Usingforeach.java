package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingforeach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(2000);
		  driver.navigate().to("");
		  List<WebElement>links=driver.findElements(By.xpath("//a"));
		  for(WebElement link:links)
		  {
			  String tag=link.getTagName();
			  System.out.println(tag);
		  }
		
	}

}
