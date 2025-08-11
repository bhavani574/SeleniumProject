package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultpileElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(2000);
		  driver.navigate().to("https://www.flipkart.com/");
		  List<WebElement>links=driver.findElements(By.xpath("//a"));
		  int countofelements=links.size();
		  System.out.println(countofelements);
		  for(int i=1;i<countofelements;i++)
		  {
			  if(i%2==0)//fetch even only
			  {
		  	  WebElement link =links.get(i);
			  String text=link.getText();
			  System.out.println(i+" "+text);
			  }
		  }
		  
		  
		  
		  
		  
//		  for(int i=countofelements-1;i>=0;i--)//reverse
//			  {
//			  	  WebElement link =links.get(i);
//				  String text=link.getText();
//				  System.out.println(i+" "+text);
//			  }
		  
		  
		  
//		  for(int i=1;i<countofelements;i+=2)//odd
//		  {
//			  WebElement link =links.get(i);
//			  String text=link.getText();
//			  System.out.println(i+" "+text);
//		  }
//		  for(int i=0;i<countofelements;i+=2)//even
//		  {
//			  WebElement link =links.get(i);
//			  String text=link.getText();
//			  System.out.println(i+" "+text);
//		  }
//		  for(int i=0;i<countofelements;i++)//only text
//		  {
//			  WebElement link =links.get(i);
//			  String text=link.getText();
//			  System.out.println(i+" "+text);
//		  }
		 // for(int i=0;i<countofelements;i++)//fetch links
		  //{ 
//			 String url=link.getAttribute("href");
//			 System.out.println(i+" "+url); 
	//}
//		  
		  driver.quit();
	}

}
