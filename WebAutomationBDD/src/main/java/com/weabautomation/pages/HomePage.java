/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 1:07:57 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.weabautomation.pages <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.weabautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webautomation.enums.WaitStratergy;
import com.webautomation.factories.ExplictWaitFactory;


/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 1:07:57 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.weabautomation.pages <br>
 * 
 * @author Rakesh Jogula
 *         <p>
 * @version 1.0
 *          <p>
 */
public class HomePage extends BasePage {

	private final By link_welcome = By.id("welcome");
	private final By link_logout = By.xpath("//a[text()='Logout']");
	private final By link_myInfo = By.id("menu_pim_viewMyDetails");
	private final By btn_edit = By.xpath("//input[@value='Edit']");
	private final By txt_firstName = By.id("personal_txtEmpFirstName");
	private final By txt_middleName = By.id("personal_txtEmpMiddleName");
	private final By txt_lastName = By.id("personal_txtEmpLastName");
	private final By txt_employeeId = By.id("personal_txtEmployeeId");
	private final By calendar_licenseExpiryDate = By.id("personal_txtLicExpDate");
	private final By radio_gender_male = By.xpath("//label[text()='Male']");
	private final By radio_gender_female = By.xpath("//label[text()='Female']");
	private final By dropdown_maritial_status = By.id("personal_cmbMarital");
	private final By btn_save = By.id("btnSave");
	private final By leave_tab = By.id("menu_leave_viewLeaveModule");
	private final By leave_tab_dropdown = By.xpath("//a[@id='menu_leave_viewLeaveModule']/parent::li/ul");
	private final By btn_assignleave_apply = By.id("menu_leave_assignLeave");
	private final By apply_leave_form = By.id("assign-leave"); 
	private final By pim_tab = By.id("menu_pim_viewPimModule");
	
	public boolean isHomePageDisplayed() {
		return isElementDisplayed(ExplictWaitFactory.performExplicitWait(link_welcome, WaitStratergy.VISIBLE));
	}

	public HomePage clickWelcome() {
		try {
			click(ExplictWaitFactory.performExplicitWait(link_welcome, WaitStratergy.CLICKABLE));
		} catch (Exception e) {
		}
		return this;
	}

	public LoginPage clicklogout() {
		try {
			click(ExplictWaitFactory.performExplicitWait(link_logout, WaitStratergy.CLICKABLE));
		} catch (Exception e) {
		}
		return new LoginPage();
	}

	public HomePage clickOnMyInfoTab() {
		try {
			click(ExplictWaitFactory.performExplicitWait(link_myInfo, WaitStratergy.CLICKABLE));
		} catch (Exception e) {
		}
		return this;
	}

	public HomePage clickOnEditMyInfoTab() {
		try {
			click(ExplictWaitFactory.performExplicitWait(btn_edit, WaitStratergy.CLICKABLE));
		} catch (Exception e) {
		}
		return this;
	}

	public HomePage enterFirstName(String firstName) {
		try {
			sendkeys(ExplictWaitFactory.performExplicitWait(txt_firstName, WaitStratergy.PRESENCE), firstName);
		} catch (Exception e) {
		}
		return this;
	}
	
	public String getFirstName() {
		String firstName = null;
		try {
			firstName = getText(ExplictWaitFactory.performExplicitWait(txt_firstName, WaitStratergy.VISIBLE));
		} catch (Exception e) {
		}
		return firstName;
	}
	
	public String getLastName() {
		String lastName = null;
		try {
			lastName = getText(ExplictWaitFactory.performExplicitWait(txt_lastName, WaitStratergy.VISIBLE));
		} catch (Exception e) {
		}
		return lastName;
	}
	
	public String getEmployeeID() {
		String employeeId = null;
		try {
			employeeId = getText(ExplictWaitFactory.performExplicitWait(txt_employeeId, WaitStratergy.VISIBLE));
		} catch (Exception e) {
		}
		return employeeId;
	}

	public HomePage enterMiddleName(String middleName) {
		try {
			sendkeys(ExplictWaitFactory.performExplicitWait(txt_middleName, WaitStratergy.PRESENCE), middleName);
		} catch (Exception e) {
		}
		return this;
	}

	public HomePage enterLastName(String lastName) {
		try {
			sendkeys(ExplictWaitFactory.performExplicitWait(txt_lastName, WaitStratergy.PRESENCE), lastName);
		} catch (Exception e) {
		}
		return this;
	}

	public HomePage enterEmployeeId(String employeeId) {
		try {
			sendkeys(ExplictWaitFactory.performExplicitWait(txt_employeeId, WaitStratergy.CLICKABLE), employeeId);

		} catch (Exception e) {

		}
		return this;
	}

	public HomePage enterLicenseExpiryDate(String licenseExpiryDate) {
		try {
			sendkeys(ExplictWaitFactory.performExplicitWait(calendar_licenseExpiryDate, WaitStratergy.PRESENCE),
					licenseExpiryDate);

		} catch (Exception e) {

		}
		return this;
	}

	public HomePage selectGender(String gender) {
		try {
			if (gender.equalsIgnoreCase("male")) {
				click(ExplictWaitFactory.performExplicitWait(radio_gender_male, WaitStratergy.CLICKABLE));
			} else {
				click(ExplictWaitFactory.performExplicitWait(radio_gender_female, WaitStratergy.CLICKABLE));
			}
		} catch (Exception e) {
		}
		return this;
	}

	public HomePage selectMaritalStatus(String status) {
		WebElement dropdown_maritialstatus = ExplictWaitFactory.performExplicitWait(dropdown_maritial_status,
				WaitStratergy.VISIBLE);
		selectByVisibleText(dropdown_maritialstatus, status);
		return this;
	}

	public HomePage clickOnSaveBtnMyInfoTab() {
		try {
			click(ExplictWaitFactory.performExplicitWait(btn_save, WaitStratergy.CLICKABLE));
		} catch (Exception e) {

		}
		return this;
	}
	
	public HomePage clickOnLeaveTab() {
		try {
			click(ExplictWaitFactory.performExplicitWait(leave_tab, WaitStratergy.CLICKABLE));
		} catch (Exception e) {

		}
		return this;
	}
	
	public LeavePage clickOnAssignLeaveDropdown() {
		try {
			click(ExplictWaitFactory.performExplicitWait(btn_assignleave_apply, WaitStratergy.CLICKABLE));
		} catch (Exception e) {

		}
		return new LeavePage();
	}

	
	public void isLeavedropdownDisplayed() {
		try {
			isElementDisplayed(ExplictWaitFactory.performExplicitWait(leave_tab_dropdown, WaitStratergy.CLICKABLE));
		} catch (Exception e) {

		}
	}
	
	public LeavePage isApplyLeavePageDisplayed() {
		try {
			isElementDisplayed(ExplictWaitFactory.performExplicitWait(apply_leave_form, WaitStratergy.VISIBLE));
		} catch (Exception e) {

		}
		return new LeavePage();
	}

	/**
	 * @return
	 */
	public PIMPage clickOnpimtab() {
		click(ExplictWaitFactory.performExplicitWait(pim_tab, WaitStratergy.CLICKABLE));
		return new PIMPage();
	}

}
