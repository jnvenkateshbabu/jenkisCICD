@background
Feature: verify the student qualification
 Background: verify the eligible
 Given student should be high mark in all subject
 And and above 1150
 
  @medicine
  Scenario: Eligibility of medicine
    Given bio che phy mark is high
    
    When yes bio criteria matched
    
    Then qualified for medicine
    
    
    @engineering
  Scenario: Eligibility of engineering
    Given math che phy mark is high
    
    When yes math criteria matched
    
    Then qualified for engineering
    
