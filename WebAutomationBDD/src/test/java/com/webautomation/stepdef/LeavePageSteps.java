/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 1:38:57 PM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.stepdef;

import com.weabautomation.pages.HomePage;
import com.weabautomation.pages.LeavePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 1:38:57 PM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * 
 * @author Rakesh Jogula
 *         <p>
 * @version 1.0
 *          <p>
 */
public class LeavePageSteps {

	HomePage homePage = new HomePage();
	LeavePage leavePage = null;
	
	@Given("^user is on Leave page$")
	public void user_is_on_leave_page() throws Throwable {
		leavePage = homePage.isApplyLeavePageDisplayed();
	}

	@Then("^Select Leave Type as (.+)$")
	public void select_leave_type_as(String leavetype) {
		leavePage.selectLeaveType(leavetype);
	}

	@And("^Enter From Date and To Date$")
	public void enter_from_date_and_to_date() {
		leavePage.enterFromDate()
		         .entertoDate();
	}
	
	@Then("^Click on Apply Button$")
	public void click_on_apply_button() {
		leavePage.clickOnApply();
	}

	@Then("^Sucessfully Submitted message is displayed$")
	public void sucessfully_submitted_message_is_displayed() {
	}


	
}
