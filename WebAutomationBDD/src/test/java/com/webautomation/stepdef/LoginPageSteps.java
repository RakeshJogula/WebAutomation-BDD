/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:12:10 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.stepdef;



import org.junit.Assert;

import com.weabautomation.pages.LoginPage;
import com.webautomation.driver.DriverManager;
import com.webautomation.utils.PropertyUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:12:10 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.stepdef <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public class LoginPageSteps {
	
	LoginPage loginPage = new LoginPage();;
	private static String title = null;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverManager.getDriver().get(PropertyUtil.get("url"));
		loginPage.isLoginPageDisplayed();
	}

	@When("user gets the title of login")
	public void user_gets_the_title_of_login() {
		title = loginPage.getTitle();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expected) {
	    Assert.assertTrue(title.equals(expected));
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
	   Assert.assertTrue(loginPage.isForgotLoginDisplayed());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	   loginPage.enteruserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   loginPage.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   loginPage.clickOnLogin();
	}



}
