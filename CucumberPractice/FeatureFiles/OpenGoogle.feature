@opengoogle
Feature: Open Google

  Scenario: Open Google in a web browser
    Given I have opened the browser
    When I navigate to "https://www.google.com"
    Then the page title should be "Google"
