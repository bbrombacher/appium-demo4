package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class TextPage extends Page{

	
	public TextPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	
	
}
