package execution;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution\\HomePage.feature"},
		
		glue = {"execution"},
		
		plugin = {"pretty"}
		
		)




public class AmazonRunnerTest extends AbstractTestNGCucumberTests{
	
//	writing the data provider to perform the parallel execution
	
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	

}