package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer extends BasePage
{

	public AddNewCustomer(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement NewCust;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement CName;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[2]")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement Dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;

	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement Pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement Telenumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement Submit;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	
	public void clickNC()
	{
		NewCust.click();
	}
	
	public void setName(String name)
	{
		CName.sendKeys(name);
	}
	
	public void setGender()
	{
		Gender.click();
	}
	
	public void setDob(String dd,String mm,String yy)
	{
		Dob.sendKeys(dd);
		Dob.sendKeys(mm);
		Dob.sendKeys(yy);
	}
	
	public void setAdd(String add)
	{
		Address.sendKeys(add);
	}
	
	public void setCity(String city)
	{
		City.sendKeys(city);
	}
	
	public void setState(String state)
	{
		State.sendKeys(state);
	}
	
	public void setPin(String pin)
	{
		Pin.sendKeys(pin);
	}
	
	public void setNum(String num)
	{
		Telenumber.sendKeys(num);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setPass(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		Submit.click();
	}
}
