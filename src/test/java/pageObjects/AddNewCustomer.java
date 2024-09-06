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
	
	@FindBy(xpath="//input[@value='f']")
	WebElement GenderF;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement GenderM;
	
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
		CName.clear();
		CName.sendKeys(name);
	}
	
	public void setGenderF()
	{
		
		GenderF.click();
	}
	
	public void setGenderM()
	{
		
		GenderM.click();
	}
	
	public void setDob(String dd,String mm,String yy)
	{
		
		Dob.clear();
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
		City.clear();
		City.sendKeys(city);
	}
	
	public void setState(String state)
	{
		State.clear();
		State.sendKeys(state);
	}
	
	public void setPin(String pin)
	{
		Pin.clear();
		Pin.sendKeys(pin);
	}
	
	public void setNum(String num)
	{
		Telenumber.clear();
		Telenumber.sendKeys(num);
	}
	
	public void setEmail(String email)
	{
		Email.clear();
		Email.sendKeys(email);
	}
	
	public void setPass(String pass)
	{
		Password.clear();
		Password.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		Submit.click();
	}
	
	


	
}
