package testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObjects.EditCustomerPage;
import pageObjects.LoginPage;
import testBase.Baseclass;

public class TC004_DeleteCustomerTest extends Baseclass{
	
	
	@Test
	public void deletec() throws InterruptedException
	{
		
	LoginPage lp = new LoginPage(driver);
	lp.setUser(p.getProperty("user"));
	lp.setPass(p.getProperty("password"));
	lp.clckLog();
	
	
	EditCustomerPage ep = new EditCustomerPage(driver);
	
	
	
	ep.clickDeletec();
	ep.enterCustId("75860");
	ep.clickSubmit();
	Alert myalert = driver.switchTo().alert();
	myalert.accept();
	Thread.sleep(5000);
	myalert.accept();
	
	
	}

}
