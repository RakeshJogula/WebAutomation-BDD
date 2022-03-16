/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 9:37:53 PM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.runner <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 9:37:53 PM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.runner <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"rerun:target/failedrerun.txt"
				 },
		monochrome = true,
		features = {"@target/failedrerun.txt"},
		 glue = {"com.webautomation.stepdef","com.webautomation.hooks"}		 
		)
public class FailedRunTest {

}
