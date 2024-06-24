package org.backgroud;

import io.cucumber.java.en.Given;

public class BackgroupBeforeDefinition {
	
	@Given("student should be high mark in all subject")
	public void student_should_be_high_mark_in_all_subject() {
	    System.out.println("yes high mark in all subject");
	}
	    @Given("and above 1150")
	    public void and_above_1150() {
	        System.out.println("Yes more than 1150");
	    }


}

