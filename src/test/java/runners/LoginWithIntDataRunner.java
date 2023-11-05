package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\LoginWithData.feature"},
		
		glue = {"steps"},
		
		publish = true	
		
		)

public class LoginWithIntDataRunner extends AbstractTestNGCucumberTests {

}
