/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:56:31 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.weabautomation.pages <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.weabautomation.pages;

import org.openqa.selenium.By;

import com.webautomation.enums.WaitStratergy;
import com.webautomation.factories.ExplictWaitFactory;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:56:31 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.weabautomation.pages <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public class LoginPage extends BasePage {
	
	private final By username = By.id("txtUsername");
	private final By password = By.id("txtPassword");
	private final By button = By.id("btnLogin");
	private final By forgotLogin = By.id("forgotPasswordLink");
	private final By logo = By.id("divLogo");
	private final By link_welcome = By.id("welcome");

	
	public String getTitle() {
		return getPageTitle();
	}
	
	public LoginPage isLoginPageDisplayed() {
		isElementDisplayed(ExplictWaitFactory.performExplicitWait(logo, WaitStratergy.VISIBLE));
		return this;
	}
	
	public boolean isForgotLoginDisplayed() {
		return isElementDisplayed(ExplictWaitFactory.performExplicitWait(forgotLogin, WaitStratergy.VISIBLE));
	}
	
	public LoginPage enteruserName(String usernameref) {
		sendkeys(ExplictWaitFactory.performExplicitWait(username, WaitStratergy.VISIBLE),usernameref);
		return this;
	}
	
	public LoginPage enterPassword(String passwordref) {
		sendkeys(ExplictWaitFactory.performExplicitWait(password, WaitStratergy.VISIBLE),passwordref);
		return this;
	}
	
	public LoginPage clickOnLogin() {
		click(ExplictWaitFactory.performExplicitWait(button, WaitStratergy.CLICKABLE));
		return this;
	}
	
	public HomePage waitUntilHomePageisLoaded() {
		isElementDisplayed(ExplictWaitFactory.performExplicitWait(link_welcome, WaitStratergy.VISIBLE));
		return new HomePage();
	}

}
