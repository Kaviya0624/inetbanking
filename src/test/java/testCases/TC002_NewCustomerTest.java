package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddNewCustomer;
import pageObjects.LoginPage;
import testBase.Baseclass;

public class TC002_NewCustomerTest extends Baseclass
{
	@Test
	public void addNew() throws InterruptedException  
	{
		
	LoginPage lp = new LoginPage(driver);
	lp.setUser(p.getProperty("user"));
	lp.setPass(p.getProperty("password"));
	lp.clckLog();
	
	
	AddNewCustomer ap = new AddNewCustomer(driver);
	ap.clickNC();
	ap.setName(randomString().toUpperCase());
	ap.setGender();
	ap.setDob("06", "Oct", "2000");
	ap.setAdd("new building highway");
	ap.setCity("Cbe");
	ap.setState("Tamilnadu");
	ap.setPin("637408");
	ap.setNum(randomNumber());
	ap.setEmail(randomString()+"@gmail.com");
	ap.setPass("kaviya");
	ap.clickSubmit();
	
	Thread.sleep(5000);
	
	logger.info("validation started....");
	
	Thread.sleep(5000);
	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if(res==true)
	{
		Assert.assertTrue(true);
		logger.info("test case passed....");
		
	}
	else
	{
		logger.info("test case failed....");
		Assert.assertTrue(false);
	}
	

	Thread.sleep(5000);
	}

	
	
}
