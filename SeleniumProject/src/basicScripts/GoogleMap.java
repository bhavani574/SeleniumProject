package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.co.in/maps/@12.9826816,77.5979008,12z?entry=ttu&g_ep=EgoyMDI1MDUwNy4wIKXMDSoJLDEwMjExNDU1SAFQAw%3D%3D");
		  driver.findElement(By.xpath("//span[@ class='google-symbols NhBTye G47vBd']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Vijyanagar");
		 
		 // driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		 // Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose destination, or click on the map...']")).sendKeys("jayanagr");
	}
	

}
