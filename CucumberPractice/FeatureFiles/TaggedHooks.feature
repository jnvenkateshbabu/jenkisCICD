@loginfacebook
Feature: Login Facebook in different browsers
 
  @logininchrome
  Scenario: Login Facebook in chrome
    Given Send user name in chrome
    When Send password in chrome
    Then enter login in chrome
    
     @logininfirefox
  Scenario: Login Facebook in firefox
    Given Send user name in firefox
    When Send password in firefox
    Then enter login in firefox
  

  


