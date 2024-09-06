package testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObjects.AddNewCustomer;
import pageObjects.EditCustomerPage;
import pageObjects.LoginPage;
import testBase.Baseclass;

public class TC003_EditCustomerTest extends Baseclass {
	
	
	@Test
	public void Editcustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUser(p.getProperty("user"));
		lp.setPass(p.getProperty("password"));
		lp.clckLog();
		
		EditCustomerPage ep = new EditCustomerPage(driver);
		ep.clickEditc();
		ep.enterCustId("59342");
		ep.clickSubmit();
		
		AddNewCustomer ap = new AddNewCustomer(driver);
		
		ap.setCity("Salem");
		ap.setPin("642789");
		ap.setNum(randomNumber());
		
		ap.clickSubmit();
		
		Alert myalert = driver.switchTo().alert();
		myalert.accept();
		Thread.sleep(5000);
		
		
		
	}
	

}
