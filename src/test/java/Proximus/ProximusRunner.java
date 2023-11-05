package Proximus;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Proximus\\ProximusHome.feature"},
		
		glue = {"Proximus"},
		
		plugin = {"pretty"}
		
		)



public class ProximusRunner extends AbstractTestNGCucumberTests {

}
