#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Login Page Feature

  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of login
    Then Page title should be "OrangeHRM" 

  Scenario: Forgot Password Link
    Given user is on login page
    Then forgot password link should be displayed
    
  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on login button
    
    