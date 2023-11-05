package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverconfig.DriverFactory;
import driverconfig.DriverFactory2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	
	HomePage homepage = new HomePage(DriverFactory2.getDriver());
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
		WebDriver driver = DriverFactory2.getDriver();
		driver.get("https://www.amazon.in/");
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String word) {
	   
		String title = homepage.getTitleOfPage();
		
		boolean isWordPresent = title.contains(word);
		
		Assert.assertTrue(isWordPresent);
		
		
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	   
		boolean isDisplay = homepage.isCartIconDisplayed();
		
		Assert.assertTrue(isDisplay);
	}

	@When("user clicks on fashion link")
	public void user_clicks_on_fashion_link() {
	    homepage.carouselNavigation();
	}

	@Then("user should redirect  to fashion page")
	public void user_should_redirect_to_fashion_page() {
	boolean  isDisplayed  = homepage.fitnessModule();
	
	Assert.assertTrue(isDisplayed);
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	   homepage.enterUsername(uname);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
	   homepage.enterPassword(pwd);
	}

}