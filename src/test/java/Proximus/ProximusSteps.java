package Proximus;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverconfig.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProximusHomePage;

public class ProximusSteps {
	
	ProximusHomePage ProximusHomePage = new ProximusHomePage(DriverFactory.getDriver());
	
	@Given("user should be on home page")
	public void user_should_be_on_home_page() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.proximus.be/en/id_personal/personal.html");
	}

	@Then("home page title should contains {string}")
	public void home_page_title_should_contains(String string) {
		
        String title = ProximusHomePage.getTitleOfPage();
		
		boolean isWordPresent = title.contains(string);
		
		Assert.assertTrue(isWordPresent);
	}
	
	@When("user click on expect all cookies")
	public void user_click_on_expect_all_cookies() {
	    
		
	}

	@When("user clicks on Packs")
	public void user_clicks_on_packs() {
		
		ProximusHomePage.click();
	   
	}

	@Then("user should redirect to Packs page contains {string}")
	public void user_should_redirect_to_packs_page_contains(String string) {
		
       String title = ProximusHomePage.getTitleOfPage();
		
		boolean isWordPresent = title.contains(string);
		
		Assert.assertTrue(isWordPresent);
	    
	}

}
