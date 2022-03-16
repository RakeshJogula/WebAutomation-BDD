/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 1:23:18 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.hooks <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.hooks;

import com.webautomation.driver.Driver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 1:23:18 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.hooks <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public class FrameworkHooks {
	
	
	
	@Before
	public void setup(Scenario scenario) {
		Driver.initDriver("chrome","99.0.4844.51");

	}

	
	@After
	public void tearDown(Scenario scenario) {
		Driver.quitDriver();
	}

}
