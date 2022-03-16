/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 17, 2022 <br>
 * <b>Time</b> - 1:25:14 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.stepdef;

import com.weabautomation.pages.HomePage;
import com.weabautomation.pages.PIMPage;
import com.webautomation.model.TestContext;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 17, 2022 <br>
 * <b>Time</b> - 1:25:14 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public class PIMPageSteps {
	
	/**
	 * 
	 */
	HomePage homePage = new HomePage();
	PIMPage pimpage = null;
	private TestContext testContext = null;
	
	public PIMPageSteps(TestContext testContext) {
		this.testContext= testContext;
	}
	
	@Given("^Employee list tab is displayed$")
    public void employee_list_tab_is_displayed() {
		pimpage.isEmployeeListTabDisplayed();
    }

    @When("^user enters employee name in text box$")
    public void user_enters_employee_name_in_text_box(){
    	pimpage.enterEmployeeName(testContext.getFirstName(), testContext.getLastName());
    	pimpage.enterEmployeeID(testContext.getEmployeeId());
    }

    @Then("^click on PIM tab$")
    public void click_on_pim_tab() {
    	pimpage = homePage.clickOnpimtab();
    }
    
    @Then("^search results should be displayed$")
    public void search_results_should_be_displayed(){
    	pimpage.resultsDisplayed();
    }
    
    @And("^click on search button$")
    public void click_on_search_button() {
    	pimpage.clickSearch();
    }


}
