/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:41:12 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.constants <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.constants;



/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:41:12 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.constants <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public final class FrameworkConstants {
	
	private FrameworkConstants() {}
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGPATH = RESOURCESPATH +"/config/config.properties";
	private static final String REPORTPATHFOLDER = System.getProperty("user.dir") + "/extent-test-output/";
	private static String extentReportPath = "";
	
    public static String getResourcesPath() {
    	return RESOURCESPATH;
    }
    
    public static String getConfigPath() {
    	return CONFIGPATH;
    }

	public static String getReportpath() {
		extentReportPath = REPORTPATHFOLDER + "_index.html";
		return extentReportPath;
	}
}
