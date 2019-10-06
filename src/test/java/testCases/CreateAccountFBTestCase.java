package testCases;

import org.testng.annotations.Test;

import PageClasses.CreateAccountFBPage;
import util.CommonFunction;
import util.TestMethodSetup;

public class CreateAccountFBTestCase extends TestMethodSetup {
	
	
	
	
	
	

	@Test
	public void TestCase1()
	{
		
		
		try {
			
			CreateAccountFBPage page=new CreateAccountFBPage();
			CommonFunction com=new CommonFunction();
			
			String url=com.readPropertyFile("url");
			
			com.openUrl(url);
			
			
			page.enterFirstName();
			
			page.enterSirName();
			
			page.enterMobileNumber();
			
			page.enterPassword();
			
			page.selectdaydropdownValue();
			
			page.selectMonthDropdownValue();
			
			page.selectYeardropdownValue();
			
			
			page.clickonGenderRadioBtn();	
			
			
			page.clickonSignUpBtn();
			
			page.verifyErrorMessage();
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
