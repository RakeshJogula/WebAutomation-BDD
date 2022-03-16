#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Check Employee details in PIM Employee List
  As a user i want to check my info added to pim employee list

  Scenario: Employee List Check
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on login button
    Given user is on Home page
    When click on My Info tab
    Then Personal Details Tab is displayed
    And fetch All Personal details Information
    Then click on PIM tab
    Given Employee list tab is displayed
    When user enters employee name in text box
    And click on search button
    Then search results should be displayed
