#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Home Page Feature

  Scenario Outline: Modify Personal Info
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on login button
    Given user is on Home page
    When click on My Info tab
    Then Personal Details Tab is displayed
    When user click on Edit button
    Then Enter Personal Details <FirstName>,<MiddleName>,<LastName>
    And Enter Other Details <EmployeeID>,<ExpiryDate>
    And Select Gender as <Gender>
    And Maritial Status as <MaritialStatus>
    When Click on Save button
    Then Sucessfully Saved message is displayed

    Examples: 
      | FirstName | MiddleName | LastName   | EmployeeID | ExpiryDate | Gender | MaritialStatus |
      | Paull     | test       | Collingsss |       6119 | 2022-03-09 | Male   | Single         |
