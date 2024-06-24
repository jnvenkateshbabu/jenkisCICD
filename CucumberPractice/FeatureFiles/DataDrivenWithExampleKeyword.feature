Feature: Login to OrangeHRM

  Scenario Outline: Login to OrangeHRM Live website and get current URL
    Given I go to OrangeHRM Live in Chrome
    When I send username "<UserName>" and password "<Password>" to the login page
    And I enter the submit button
    Then I gather the current page URL

    Examples:
      | UserName | Password |
      | Admin    | admin123 |
      | Admin    | admin12  |
      | admin    | admin123 |
      | addfd    | dsdsds   |