package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("user is at home page")
	public void user_is_at_home_page() {
	    System.out.println("Given statement");
		
	}

	@When("user clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
	   System.out.println("When for add profile");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
	    System.out.println("Entering the information");
	}

	@Then("profile should get created")
	public void profile_should_get_created() {
	   System.out.println("profile created!!");
	}

	@When("user clicks on edit profile button")
	public void user_clicks_on_edit_profile_button() {
	    System.out.println("When for edit");
	}

	@When("user updates the information")
	public void user_updates_the_information() {
	   System.out.println("When for update information");
	}

	@Then("profile should get updated")
	public void profile_should_get_updated() {
	   System.out.println("profile updated!!");
	}

	@When("user clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
	   System.out.println("When for delete");
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
		
		System.out.println("Profile deleted!!");
	    	}


}
