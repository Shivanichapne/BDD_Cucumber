package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is at login page")
	public void user_is_at_login_page() {
	    System.out.println("Pre conditions get executed");
	}

	@When("User enters the username")
	public void user_enters_the_username() {
		System.out.println("enters the username");
	}

	@When("User enters the password")
	public void user_enters_the_password() {
		System.out.println("enters the password");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("click on log in page");
	}

	@Then("User redirects to home page")
	public void user_redirects_to_home_page() {
		System.out.println("validation of login");
	}
	
	@Then("page title should get display")
	public void page_title_should_get_display() {
	    System.out.println("Validation title of the page");
	}

}
