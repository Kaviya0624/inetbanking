package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerPage extends BasePage 
{
	
	public EditCustomerPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Edit Customer']")
	WebElement Editc;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement CustomerId;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement Submit;
	
	
	//delete customer
	
	@FindBy(xpath="//a[normalize-space()='Delete Customer']")
	WebElement DeleteC;
	
	
	public void clickEditc()
	{
		Editc.click();
	}
	
	public void enterCustId(String id)
	{
		CustomerId.sendKeys(id);
	}
	
	public void clickSubmit()
	{
		Submit.click();
	}
	
	//delete customer
	
	public void clickDeletec()
	{
		DeleteC.click();
	}

}
