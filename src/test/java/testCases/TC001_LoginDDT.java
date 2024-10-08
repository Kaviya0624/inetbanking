package testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.Baseclass;
import utilities.ExcelUtils;

public class TC001_LoginDDT extends Baseclass

{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String password) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUser(user);
		logger.info("user name provided");
		lp.setPass(password);
		logger.info("password provided");
		lp.clckLog();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		
		
	}
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
			
		driver.switchTo().alert();
		return true;
		
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException 
	{
		String path = System.getProperty("user.dir") +"\\testData\\LoginData.xlsx";
		int rownum=ExcelUtils.getRowCount(path, "Sheet1");
		int colcount=ExcelUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=ExcelUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
		
		return logindata;
		
	}
	

}
