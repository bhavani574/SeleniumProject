package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;

class EmptyChromeBrowser {
	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	}

}
