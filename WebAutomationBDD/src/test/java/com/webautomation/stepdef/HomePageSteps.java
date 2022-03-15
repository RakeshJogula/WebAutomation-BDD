/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 2:30:15 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.stepdef;

import com.weabautomation.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 2:30:15 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * 
 * @author Rakesh Jogula
 *         <p>
 * @version 1.0
 *          <p>
 */
public class HomePageSteps {

	HomePage homepage = new HomePage();

	@Given("user is on Home page")
	public void user_is_on_home_page() {
		homepage.isHomePageDisplayed();
	}

	@When("click on My Info tab")
	public void click_on_my_info_tab() {
		homepage.clickOnMyInfoTab();
	}

	@Then("Personal Details Tab is displayed")
	public void personal_details_tab_is_displayed() {

	}

	@When("user click on Edit button")
	public void user_click_on_edit_button() {
		homepage.clickOnEditMyInfoTab();
	}

	@Then("^Enter Personal Details (.+),(.+),(.+)$")
	public void enter_personal_details_(String firstname, String middlename, String lastname){
		homepage.enterFirstName(firstname);
		homepage.enterLastName(lastname);
		homepage.enterMiddleName(middlename);
	}

	@Then("Enter Other Details (.+),(.+)$")
	public void enter_other_details(String employeeId, String expirydate) {
		homepage.enterEmployeeId(employeeId);
		homepage.enterLicenseExpiryDate(expirydate);
	}

	@Then("Select Gender as (.+)$")
	public void select_gender_as(String gender) {
		homepage.selectGender(gender);

	}

	@Then("Maritial Status as (.+)$")
	public void maritial_status_as_single(String status) {
		homepage.selectMaritalStatus(status);
	}

	@When("Click on Save button")
	public void click_on_save_button() {
		homepage.clickOnSaveBtnMyInfoTab();
	}

	@Then("Sucessfully Saved message is displayed")
	public void sucessfully_saved_message_is_displayed() {

	}

}
