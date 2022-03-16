#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Leaver Page Feature

 Scenario Outline: Apply Leave
    Given user is on login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on login button
    Given user is on Home page
		When click on Leave Tab
		Then Leave List Tab is displayed
		And click on Assign Leave in dropdown
		Given user is on Leave page
		Then Select Leave Type as <LeaveType> 
		And Enter From Date and To Date
		Then Click on Apply Button
		Then Sucessfully Submitted message is displayed
		Then logout
		
		Examples:
		|LeaveType|
		|CAN - Bereavement|
		
			