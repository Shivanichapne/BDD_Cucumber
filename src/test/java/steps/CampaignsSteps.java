package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignsSteps {
	
	@Given("user is at the campaigns page")
	public void user_is_at_the_campaigns_page() {
	   System.out.println("Given statement");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
	  System.out.println("Creating campaign");
	}

	@When("user enters information")
	public void user_enters_information() {
	   System.out.println("Entering information");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
	    System.out.println("Saving information");
	}

	@Then("Campaign should get created")
	public void campaign_should_get_created() {
	  System.out.println("Campaign created !!");
	}

	@When("user click on edit campaign")
	public void user_click_on_edit_campaign() {
	 System.out.println("Edit campaign");
	}

	@When("user enters the schedule")
	public void user_enters_the_schedule() {
	   System.out.println("Schedule campaign");
	}

	@Then("Campaign should get schedule")
	public void campaign_should_get_schedule() {
	    System.out.println("Verify schedule");
	}

	@When("user click on send campaign")
	public void user_click_on_send_campaign() {
	    System.out.println("Sending campaign");
	}

	@Then("Campaign should get sent")
	public void campaign_should_get_sent() {
	   System.out.println("Campaign sent");
	}


}
