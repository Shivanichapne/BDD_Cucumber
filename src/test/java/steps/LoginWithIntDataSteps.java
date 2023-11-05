package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithIntDataSteps {

	@Given("User is at {int} loginpage")
	public void user_is_at_loginpage(Integer int1) {
		System.out.println("User is at server number :"+int1);
	}
	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	    System.out.println("Entering username :"+uname);
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
		 System.out.println("Entering password :"+pwd);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	    System.out.println("Click on login");
	}

	@Then("User should get logged into app")
	public void user_should_get_logged_into_app() {
	    System.out.println("verify login");
	}


	

}
