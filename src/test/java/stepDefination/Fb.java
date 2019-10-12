package stepDefination;

import PageClasses.CreateAccountFBPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.CommonFunction;
import util.TestMethodSetup;

public class Fb extends TestMethodSetup {
	
	
	TestMethodSetup t1=new TestMethodSetup();
	CommonFunction com=new CommonFunction();
	
	@Given("^I open facebook website$")
	public void i_open_facebook_website() throws Throwable {
	   
		//t1.openBrowser();
		String baseUrl=com.readPropertyFile("url");
		com.openUrl(baseUrl);
		
	}

	@When("^I enter All New User Details$")
	public void i_enter_All_New_User_Details() throws Throwable {
		
		
		
		CreateAccountFBPage page=new CreateAccountFBPage();
		
		page.enterFirstName();
		page.enterSirName();
		page.enterMobileNumber();
		page.enterPassword();
		page.clickonGenderRadioBtn();
		page.selectdaydropdownValue();
		page.selectMonthDropdownValue();
		page.selectYeardropdownValue();
	   
		
		
	}

	@When("^Finally I clicked on signup button$")
	public void finally_I_clicked_on_signup_button() throws Throwable {
		
		CreateAccountFBPage page=new CreateAccountFBPage();
		page.clickonSignUpBtn();
	    
		
		
	}
	
	@When("^I am checking Gender radiobutton$")
	public void i_am_checking_Gender_radiobutton() throws Throwable {
	    
		CreateAccountFBPage page=new CreateAccountFBPage();
		
		page.clickonCustomRadiobutton();
		
	}

	@Then("^User should be created$")
	public void user_should_be_created() throws Throwable {
	    
		
		
		CreateAccountFBPage page=new CreateAccountFBPage();
		page.verifyErrorMessage();
		
		
	}

	
	
	
	

}
