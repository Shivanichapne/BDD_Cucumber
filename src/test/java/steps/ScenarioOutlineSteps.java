package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("User is at signup page")
	public void user_is_at_signup_page() {
	   System.out.println("Given statement");
	}

	@When("User enters name {string} in the form")
	public void user_enters_name_in_the_form(String name) {
		System.out.println("Entered name is :"+name);
	}

	@When("User enters the age {int}")
	public void user_enters_the_age(Integer int1) {
	    System.out.println("entered age is :"+int1);
	}

	@When("User confirms the gender as {string}")
	public void user_confirms_the_gender_as(String string) {
	   System.out.println("Selected gender is :"+string);
	}

	@Then("User will get create")
	public void user_will_get_create() {
	   System.out.println("User has been created"); 
	}


}
