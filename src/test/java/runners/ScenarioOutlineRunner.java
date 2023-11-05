package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\ScenarioOutline.feature"},
		
		glue = {"steps"},
		
		publish = true
		)


public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
