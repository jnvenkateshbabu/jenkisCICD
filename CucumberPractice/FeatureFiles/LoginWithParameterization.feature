Feature: Login OrangeHRM
Scenario: Login to OrangeHRM Live website and get current URL
    Given Open OrangeHRM Live in a Chrome browser
    When Send username "Admin" and password "admin123" to their respective fields
    And Click the login
    Then Get the current page URL
    