/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 1:45:06 AM <br>
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
 * <b>Time</b> - 1:45:06 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.runner <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = {"src/test/resources/features"},
		 glue = {"com.webautomation.stepdef","com.webautomation.hooks"},
		 plugin = {"pretty"}
		 
		)
public class TestRunner {

}
