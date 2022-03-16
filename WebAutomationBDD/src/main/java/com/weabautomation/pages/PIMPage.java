/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 17, 2022 <br>
 * <b>Time</b> - 1:29:44 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.weabautomation.pages <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.weabautomation.pages;


import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import com.webautomation.enums.WaitStratergy;
import com.webautomation.factories.ExplictWaitFactory;




/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 17, 2022 <br>
 * <b>Time</b> - 1:29:44 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.weabautomation.pages <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public class PIMPage extends BasePage{

	/**
	 * 
	 */
	public PIMPage() {
		
	}
	
	private final By txt_employeelisttab = By.id("menu_pim_viewEmployeeList");
	private final By txt_employeeName = By.id("empsearch_employee_name_empName");
	private final By txt_employeeID = By.name("empsearch[id]");
	private final By btn_search =  By.id("searchBtn");
	
	private final String table_rows = "//table[@id='resultTable']//tr";

	public PIMPage isEmployeeListTabDisplayed() {
		isElementDisplayed(ExplictWaitFactory.performExplicitWait(txt_employeelisttab, WaitStratergy.VISIBLE));
		click(ExplictWaitFactory.performExplicitWait(txt_employeelisttab, WaitStratergy.VISIBLE));
		return new PIMPage();
	}
	
	public PIMPage enterEmployeeName(String firstName,String lastName) {
		sendkeys(ExplictWaitFactory.performExplicitWait(txt_employeeName, WaitStratergy.VISIBLE),firstName+" "+lastName);
		return this;
		
	}
	
	public PIMPage enterEmployeeID(String employeeID) {
		sendkeys(ExplictWaitFactory.performExplicitWait(txt_employeeID, WaitStratergy.VISIBLE),employeeID);
		return this;	
	}
	
	public PIMPage clickSearch() {
		click(ExplictWaitFactory.performExplicitWait(btn_search, WaitStratergy.VISIBLE));
		return this;	
	}
	
	
	public PIMPage resultsDisplayed() {
		int listSize = elementList(table_rows).size();
		Assertions.assertThat(listSize).isGreaterThan(1);
		return this;
		
	}
	
}
