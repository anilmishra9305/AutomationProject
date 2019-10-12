package stepDefination;

import PageClasses.FlipkartPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.CommonFunction;
import util.TestMethodSetup;

public class FlipkartLogin extends TestMethodSetup {
	
	
	CommonFunction com=new CommonFunction();
	TestMethodSetup te=new TestMethodSetup();
	
	@Before
	public void beforeTag()
	{
		
		te.openBrowser();
		
	}
	
	@Given("^Open Flipkart website$")
	public void Open_Flipkart_website()
	{
		String baseurl=com.readPropertyFile("url3");
		com.openUrl(baseurl);
		
	}
	
	
	@When("^I enter mobileNumber$")
	public void I_enter_mobileNumber()
	{
		
	FlipkartPage page=new FlipkartPage();
	page.enterMobileNumber();
		
	}
	
	
	@And("^I enter Password$")
	public void I_enter_Password()
	{
		
		FlipkartPage page=new FlipkartPage();
		page.enterPassword();
		
		
		
	}
	
	
	@Then("^click on Login button$")
	public void click_on_Login_button()
	{
		
		FlipkartPage page=new FlipkartPage();
		page.clickSubmitBtn();
	}
	
	
	@After
	public void closeBrowser1()
	{
		
		te.closeBrowser();
	}
	
	
	
	
	
	

}
