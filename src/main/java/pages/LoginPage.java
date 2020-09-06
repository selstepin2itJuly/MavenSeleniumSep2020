package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver dr;
	
	public LoginPage(WebDriver driver) 
	{
		this.dr=driver;
		PageFactory.initElements(dr, this);
	}

	//@FindBy, @FindBys, @FindAll
	
	@FindBy(css="[id='Email']")
	private WebElement email;
	
	@FindBy(css="[id='Password']")
	private WebElement pass;
	
	@FindBy(css="[type='submit']")
	private WebElement loginButton;
	
	public void loginToApplication(String user, String password)
	{
		email.clear();
		email.sendKeys(user);
		pass.clear();
		pass.sendKeys(password);
		loginButton.click();
		
	}
	
}
