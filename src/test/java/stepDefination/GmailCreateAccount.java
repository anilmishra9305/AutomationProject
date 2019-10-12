package stepDefination;

import PageClasses.GmailCreateAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import util.CommonFunction;
import util.TestMethodSetup;

public class GmailCreateAccount {

	
	//CTR+SHIFT+O from keyboard for missing import
	
	CommonFunction com=new CommonFunction();
	
	TestMethodSetup te=new TestMethodSetup();
	
	@Given("^I am opening gmail page$")
	public void i_am_opening_gmail_page() throws Throwable {
		
		
		//te.openBrowser();
		
		String urlvalue=com.readPropertyFile("url2");
		com.openUrl(urlvalue);
		
		
	    
	}

	@When("^I enter firstName as \"(.*?)\"$")
	public void i_enter_firstName_as(String arg1) throws Throwable {
		
		GmailCreateAccountPage g1=new GmailCreateAccountPage();
		
		g1.enterFirstName(arg1);
	    

	
	}

	@When("^I enter lastName as \"(.*?)\"$")
	public void i_enter_lastName_as(String arg1) throws Throwable {

		GmailCreateAccountPage g1=new GmailCreateAccountPage();
		g1.enterLastName(arg1);
	
	
	}

	@When("^I enter userName as \"(.*?)\"$")
	public void i_enter_userName_as(String arg1) throws Throwable {
		
		
		GmailCreateAccountPage g1=new GmailCreateAccountPage();
		g1.enterUserName(arg1);
	    
		
	}

	@When("^I enter password as \"(.*?)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		
		
		GmailCreateAccountPage g1=new GmailCreateAccountPage();
		g1.enterPassword(arg1);
	    
	}

	@When("^I enter confirm password as \"(.*?)\"$")
	public void i_enter_confirm_password_as(String arg1) throws Throwable {
	    
		GmailCreateAccountPage g1=new GmailCreateAccountPage();
		g1.enterConfirmPassword(arg1);
		
	}


	
	
}
