package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	private WebDriver dr;
	
	public DashboardPage(WebDriver driver)
	{
		this.dr=driver;
		PageFactory.initElements(dr, this);
	}

	@FindBy(linkText="Logout")
	private WebElement logout;
	
	public boolean logoutVisible()
	{
		boolean b=false;
		try 
		{
			b=logout.isDisplayed();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return b;
		
	}
}

