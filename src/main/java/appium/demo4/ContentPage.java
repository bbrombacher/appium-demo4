package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class ContentPage extends Page{

	
	public ContentPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	
	
}
