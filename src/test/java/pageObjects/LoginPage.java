package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	
	public LoginPage(WebDriver driver)
	{
		super(driver); 
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement enterUserid;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement enterPass;
	
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement clickLogin;
	
	@FindBy(xpath = "//img[@alt='Guru99 Demo Sites']")
	WebElement imgExists;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement lnkLogout;

	public void setUser(String user)
	{
		enterUserid.sendKeys(user);
	}
	
	public void setPass(String password)
	{
		enterPass.sendKeys(password);
	}
	
	public void clckLog()
	{
		clickLogin.click();
	}
	
	public boolean img()
	{
			try
			{
				return(imgExists.isDisplayed());
			}
			catch(Exception e)
		{
				return false;
			}
			
		}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}

}
