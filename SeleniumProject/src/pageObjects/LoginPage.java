package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;


	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsn()
	{
		return usn;
	}
	public WebElement getPass()
	{
		return password;
	}
	public WebElement getLogin()
	{
		return login;
	}
}
