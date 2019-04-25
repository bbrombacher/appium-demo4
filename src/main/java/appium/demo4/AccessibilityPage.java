package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class AccessibilityPage extends Page{

	
	public AccessibilityPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	
	
}
