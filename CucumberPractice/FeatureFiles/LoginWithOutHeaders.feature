Feature: Login OrangeHRM
Scenario: Login to OrangeHRM Live website and get current URL
    Given Open OrangeHRM Live in a Chrome
    When Send username and password to login page
    |UserName|Password|
    |Admin   |admin123|
    And Click the submit button
    Then Retrive the current page URL
    