package mouseOverActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertandconfirmation {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		  driver.findElement(By.id("deleteButton")).click();
		  Alert popup=driver.switchTo().alert();
		  System.out.println(popup.getText());
		  Thread.sleep(2000);
		 // popup.sendKeys("Qspider");//this used only when the pop-upor dialogues box is have text filed 
		  popup.accept();
		 // popup.dismiss();
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  
		  
		  
	}

}
