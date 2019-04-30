package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class OSPage extends Page{

	
	public OSPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	
	
}
