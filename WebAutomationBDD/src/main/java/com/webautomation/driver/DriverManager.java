/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:15:26 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.driver <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:15:26 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.driver <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public final class DriverManager {
	
	private DriverManager() {
		
	}
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>(); 

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver driverref) {
		if (Objects.nonNull(driverref))
			driver.set(driverref);
	}
	
	public static void removeDriver() {
		driver.remove();
	}
	
	
	
}
