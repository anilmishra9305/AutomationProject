package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonFunction;
import util.TestMethodSetup;

public class GmailCreateAccountPage extends TestMethodSetup {
	
	
	
	@FindBy(name="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	
	@FindBy(id="username")	
	public WebElement userName;
	
	@FindBy(name="Passwd")
	public WebElement password;
	
	@FindBy(name="ConfirmPasswd")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//span/span[contains(.,'Next')]")
	public WebElement nextButton;
	
	
	
	public GmailCreateAccountPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	CommonFunction com=new CommonFunction();
	
	public void enterFirstName(String firstname)
	{
		
		try {
			
			com.enterdata(firstName, firstname);
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		
	}
	
	
	
	public void enterLastName(String lastname)
	{
		
		try {
			
			com.enterdata(lastName, lastname);
			
			
		} catch (Exception e) {
          e.printStackTrace();
		
		}
		
	}
	
	
	public void enterUserName(String username)
	{
		
		try {
			com.enterdata(userName,username);
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		
		
	}
	
	
	
	public void enterPassword(String pass)
	{
		
		try {
			
			com.enterdata(password,pass);
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		
		
	}
	
	
	
	public void enterConfirmPassword(String cpass)
	{
		try {
			
			com.enterdata(confirmPassword,cpass);
			
		} catch (Exception e) {

		e.printStackTrace();
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
