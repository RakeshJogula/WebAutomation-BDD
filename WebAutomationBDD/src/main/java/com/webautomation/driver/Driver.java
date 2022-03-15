/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:27:24 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.driver <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.driver;

import java.util.Objects;

import com.webautomation.utils.PropertyUtil;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:27:24 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.driver <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public final class Driver {
	
	private Driver() {}
	
	public static void initDriver(String browserName,String version) {
		if(Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(DriverFactory.getDriver(browserName));
		}
		 DriverManager.getDriver().manage().window().maximize();
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.removeDriver();
		}
	}

}
