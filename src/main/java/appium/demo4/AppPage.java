package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class AppPage extends Page{

	
	public AppPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	
	
}
