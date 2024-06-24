@login
Feature: Login OrangeHRM
Scenario: Login to OrangeHRM Live website and get current URL
    Given Access OrangeHRM Live in a Chrome browser
    And Copy the username and password and store them in strings
    When Send username and password to their respective fields
    And Click the login button
    Then Retrieve the current page URL
    And Check additional outcomes