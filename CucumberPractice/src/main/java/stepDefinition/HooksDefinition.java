package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDefinition {
	
	@Given("First")
	public void first() {
		System.out.println("First"); 
	}
	@When("Second")
	public void second() {
		System.out.println("Second"); 
	}
	@Then("third")
	public void third() {
	    System.out.println("Third");
	}


}
