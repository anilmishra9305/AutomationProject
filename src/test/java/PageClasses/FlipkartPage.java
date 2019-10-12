package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonFunction;
import util.TestMethodSetup;

public class FlipkartPage extends TestMethodSetup {
	
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement mobileNUmber;
	
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement submitBtn;
	
	
	CommonFunction com=new CommonFunction();
	
	public FlipkartPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void enterMobileNumber()
	{
		
		com.enterdata(mobileNUmber, "8699738312");
		
		
	}
	
	
	
	public void enterPassword()
	{
		
		com.enterdata(password, "123456789");
		
	}
	
	
	
	public void clickSubmitBtn()
	{
		
		com.clickonAnyObject(submitBtn);
	}
	
	
	
	public void enterMobileNumber1(String mobilenumber)
	{
		
		com.enterdata(mobileNUmber, mobilenumber);
		
		
	}
	
	
	
	public void enterPassword1(String pass)
	{
		
		com.enterdata(password, pass);
		
	}
	
	
	
	
	
	
	
	
	

}
