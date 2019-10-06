package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "classpath:features",
		
		glue= {"stepDefination"},
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:"},
		
		monochrome=true
		
		
		
		)

public class MainRunner {
	
	
	
	
	

}
