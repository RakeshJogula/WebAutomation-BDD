/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:37:50 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.utils <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
package com.webautomation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import com.webautomation.constants.FrameworkConstants;

/**
 * <b>Info</b><br>
 * <b>Date</b> - Mar 16, 2022 <br>
 * <b>Time</b> - 12:37:50 AM <br>
 * <b>Project Name</b> - WebAutomationBDD <br>
 * <b>Package Name</b> - com.webautomation.utils <br>
 * @author Rakesh Jogula <p>
 * @version 1.0 <p>
 */
public final class PropertyUtil {
	
	private PropertyUtil(){}
	
	private static Properties property = new Properties();
	private static HashMap<String,String> CONFIGMAP = new HashMap<String, String>();
	
	static {
		try {
			FileInputStream fileInputStream = new FileInputStream(FrameworkConstants.getConfigPath());
			property.load(fileInputStream);
			
			for (String propertyKey : property.stringPropertyNames()) {
				CONFIGMAP.put(propertyKey, property.getProperty(propertyKey));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static String get(String propertyName) {
		return CONFIGMAP.get(propertyName);
		
	}
	
}
