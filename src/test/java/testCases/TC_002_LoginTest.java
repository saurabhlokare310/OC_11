package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	@Test(groups= {"Sanity","Regression","Master"})
	public void verify_login()
	{
		logger.info("*******Starting TC_002_LoginTest*******");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount link..");
		hp.clickLogin();
		logger.info("clicked on Login link..");
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("username"));
		lp.setPassword(p.getProperty("password"));
		logger.info("Entered login details..");
		lp.clickLogin();
		logger.info("clicked on Login button..");
		
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetPage=map.isMyAccountPageExist();
		
		//Assert.assertEquals(targetPage,true,"Login failed");
		Assert.assertTrue(targetPage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*******Finished TC_002_LoginTest*******");
		
	}

}
