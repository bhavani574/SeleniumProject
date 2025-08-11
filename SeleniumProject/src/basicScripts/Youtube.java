package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.youtube.com/");
		  WebElement searchyoutube=driver.findElement(By.name("search_query"));
		  searchyoutube.sendKeys("Oye!");
		  driver.findElement(By.id("search-icon-legacy")).click();
		  //driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Mr.Perfect Songs");
		  //driver.findElement(By.cssSelector("span[class='yt-icon-shape style-scope yt-icon yt-spec-icon-shape']")).click();
		  //driver.findElement(By.cssSelector("div[id='i0']")).click();
  }
}
