package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroudDefinition {
	@Given("bio che phy mark is high")
	public void bio_che_phy_mark_is_high() {
	    System.out.println("required bio subject mark is high");
	}
	@When("yes bio criteria matched")
	public void yes_bio_criteria_matched() {
	    System.out.println("yes matched");
	}
	    

	@Then("qualified for medicine")
	public void qualified_for_medicine() {
	    System.out.println("Qualified");
	}

	@Given("math che phy mark is high")
	public void math_che_phy_mark_is_high() {
		System.out.println("required math subject mark is high");
	}
	@When("yes math criteria matched")
	public void yes_math_criteria_matched() {
		System.out.println("Qualification matched for Engg");
	}
	@Then("qualified for engineering")
	public void qualified_for_engineering() {
		System.out.println("Qualified");
	}
}
