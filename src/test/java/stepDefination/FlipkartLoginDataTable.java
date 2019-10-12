package stepDefination;

import java.util.List;

import PageClasses.FlipkartPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.CommonFunction;

public class FlipkartLoginDataTable {
	
	
	CommonFunction com=new CommonFunction();
	
	@Given("^Opening Flipkart Test website$")
	public void Opening_Flipkart_Test_website()
	{
		String baseurl=com.readPropertyFile("url3");
		com.openUrl(baseurl);
	}
	
	@When("^I entering all details$")
	public void I_entering_all_details(DataTable table)
	{
		
		List data=table.raw();
		FlipkartPage page=new FlipkartPage();
		page.enterMobileNumber1(data.get(1).toString());
		page.enterPassword1(data.get(2).toString());
		
		
	}
	
	@Then("^click on Login button Here$")
	public void click_on_Login_button_Here()
	{
		
		FlipkartPage page=new FlipkartPage();
		page.clickSubmitBtn();
		
	}
	

}
