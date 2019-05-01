package appium.demo4;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class PreferencesFromXMLPage extends Page{

	public final String EDITTEXTPREFERENCES = "Edit text preference";
	public final String OKBUTTON = "OK";
	public final String TEXTFIELD = ":id/edit";
	public final String BUTTONTEST = ":id/title";
	
	public PreferencesFromXMLPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
	}
	
	//Send Keys Methods
	public void sendKeysToTextField(String text) throws Exception {
		getTextField().sendKeys(text);
		log(text + " sent to text field");
	}
	
	
	//Click methods
	public void clickEditTextPreferencesButton() throws Exception {
		getEditTextPreferencesButton().click();
		log("clickEditTextPreferencesButton");
	}
	
	public void clearTextField() throws Exception {
		getTextField().clear();
		log("clearTextField");
	}
	
	public void clickOKButton() throws Exception {
		getOKButton().click();
		log("clickOKButton");
	}
	
	
	//Get Methods
	public WebElement getEditTextPreferencesButton() throws Exception {
		//log("getEditTextPreferences WebElement");
		try {
			WebElement editTextPreferences = elementByText(EDITTEXTPREFERENCES);
			return editTextPreferences;
		}catch(Exception e) {
			throw new Exception("Could not locate: " + EDITTEXTPREFERENCES);
		}
		
	}
	
	
	
	public WebElement getTextField() throws Exception {
		//log("getTextField WebElement");
		try {
			List<WebElement> textField = elementsByResourceID(TEXTFIELD);
			return textField.get(0);
		}catch(Exception e) {
			System.out.println(e);
			throw new Exception("Coud not loate: " + TEXTFIELD);
		}
	}
	
	public WebElement getOKButton() throws Exception {
		//log("getOKButton WebElement");
		try {
			WebElement OKButton = elementByText(OKBUTTON);
			return OKButton;
		}catch(Exception e) {
			throw new Exception("Could not locate: " + OKBUTTON);
		}
		
	}
	
}
