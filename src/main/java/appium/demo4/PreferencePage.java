package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class PreferencePage extends Page{

	public final String PREFERENCESFROMXML = "1. Preferences from XML";
	
	public PreferencePage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	public PreferencesFromXMLPage openPreferencesFromXMLPage() throws Exception{
		log("openPreferencesFromXML Page");
		try {
			elementByText(PREFERENCESFROMXML).click();

		}catch(Exception e) {
			throw new Exception("Could not locate PreferencesFromXML Page");
		}
		return new PreferencesFromXMLPage(driver);
	}
	
}
