package tests;

import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import testbase.TestBase;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCaseThree {
	private WebDriver dr;
	private LoginPage lp;
	private DashboardPage dp;
	@Test
  public void LoginTestSuccess() 
  {
		lp.loginToApplication("admin@yourstore.com", "admin");
		boolean b = dp.logoutVisible();
		Assert.assertEquals(b,true);
		//Assert.assertTrue(true);
  }
  
  @Test
  public void LoginTestInvalidUser() 
  {
	  	lp.loginToApplication("admin@mystore.com", "admin");
		boolean b = dp.logoutVisible();
		Assert.assertEquals(b,true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  dr=TestBase.getInstance();
	  dr.get("https://admin-demo.nopcommerce.com/");
	  lp=new LoginPage(dr);
	  dp=new DashboardPage(dr);
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  dr.quit();
  }

}
