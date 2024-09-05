package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.Baseclass;

public class TC001_Login extends Baseclass
{
	
	@Test
	public void login() throws InterruptedException
	{
		
		logger.info("Testcase execution started.....");
		
		try
		{
			
			logger.info("Login started.....");
		LoginPage lp = new LoginPage(driver);
		lp.setUser(p.getProperty("user"));
		lp.setPass(p.getProperty("password"));
		lp.clckLog();
		
		boolean exists = lp.img();
		Assert.assertTrue(exists);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("Login ended.....");
	}
	
	
}
