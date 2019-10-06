package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonFunction;
import util.TestMethodSetup;

public class CreateAccountFBPage extends TestMethodSetup {
	
	
	

	CommonFunction com=new CommonFunction();
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	
	@FindBy(name="reg_email__")
	WebElement mobileNumber;
	
	
	@FindBy(name="reg_passwd__")
	WebElement password;
	
	@FindBy(id="day")
	WebElement day;
	
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(xpath = "//input[@value='2']")
	WebElement maleRadioButton;
	
	@FindBy(xpath = "//input[@value='-1']")
	WebElement customRadioButton;
	
	@FindBy(name="websubmit")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Sorry, we are not able to process your registration.')]")
	WebElement errorMessage;
	
	public CreateAccountFBPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterFirstName()
	{
		
		com.enterdata(firstName, "Anil");
		
	}
	
	
	public void enterSirName()
	{
		
		com.enterdata(lastName, "Mishra");
		
		
	}
	
	
	public void enterMobileNumber()
	{
		
		com.enterdata(mobileNumber, "8699738312");
		
	}
	
	
	
	public void enterPassword()
	{
		
		
		com.enterdata(password, "123456789");
		
	}
	
	
	public void selectdaydropdownValue()
	{
		
		
		com.selectdropdownByIndex(day, 7);
		
	}
	
	
	public void selectMonthDropdownValue()
	{
		
		com.selectdropdownByIndex(month, 4);
		
	}
	
	public void selectYeardropdownValue()
	{
		
		com.selectdropdownByIndex(year, 8);
		
	}
	
	
	public void clickonGenderRadioBtn()
	{
		
		com.clickonAnyObject(maleRadioButton);
		
	}
	
	public void clickonSignUpBtn()
	{
		
		com.clickonAnyObject(signUpBtn);
		
		
	}
	
	public void verifyErrorMessage()
	{
		
		com.waitForVisibiltyofElement(errorMessage);
		com.verifyResult(errorMessage);
		
		
	}
	
	public void clickonCustomRadiobutton()
	{
		com.clickonAnyObject(customRadioButton);
		
	}
	

}
