/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 2:10:14 PM <br>
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
 * <b>Time</b> - 2:10:14 PM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.weabautomation.pages <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public class LeavePage extends BasePage{
	
	private final By drpDwn_leaveType = By.id("assignleave_txtLeaveType");
	private final By txt_fromDate = By.id("assignleave_txtFromDate");
	private final By txt_toDate = By.id("assignleave_txtToDate");
	private final By btn_Apply = By.id("assignBtn");
	private final By date_from_cuurent_Date = By.xpath("//a[contains(@class,'ui-state-active')]");
	private final By date_next_next_date = By.xpath("//a[contains(@class,'ui-state-active')]/parent::td/following-sibling::td[1]");
	
	public LeavePage selectLeaveType(String type) {
		selectByVisibleText(ExplictWaitFactory.performExplicitWait(drpDwn_leaveType, WaitStratergy.CLICKABLE),type);
		return this;
	}
	
	public LeavePage enterFromDate() {
		click(ExplictWaitFactory.performExplicitWait(txt_fromDate, WaitStratergy.CLICKABLE));
		click(ExplictWaitFactory.performExplicitWait(date_from_cuurent_Date, WaitStratergy.CLICKABLE));
		return this;
	}
	
	public LeavePage entertoDate() {
		click(ExplictWaitFactory.performExplicitWait(txt_toDate, WaitStratergy.CLICKABLE));
		click(ExplictWaitFactory.performExplicitWait(date_next_next_date, WaitStratergy.CLICKABLE));
		return this;
	}
	
	public LeavePage clickOnApply() {
		click(ExplictWaitFactory.performExplicitWait(btn_Apply, WaitStratergy.CLICKABLE));
		return this;
	}

}
