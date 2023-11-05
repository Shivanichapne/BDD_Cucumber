package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
//		1. End to end scenarios
//		2. Critical functionalities
//		3. Client requirement
//		4. Repeatativeness 
		
		features = {"src\\test\\resources\\appfeatures\\Campaigns.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"},
		
		tags = "@sanity"
		
		
		)

public class CampaignsRunner extends AbstractTestNGCucumberTests{

	
	
}