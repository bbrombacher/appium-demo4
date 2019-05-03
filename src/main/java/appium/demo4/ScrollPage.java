package appium.demo4;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import java.util.List;

public class ScrollPage extends Page {
	
	public final String COUNTRY = "Country:";
	public final String COUNTRYFIELDTEXT = ":id/edit";
	public final String AUTOCOMPLETECOUNTRYSUGGESTIONS = ":id/text1";
	
	public ScrollPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	//Click methods
	
	//Get Methods
	public WebElement getCountryTextElement() throws Exception{
		log("get Country Text");
		try {
		return scrollIntoView(COUNTRY);
		}catch(Exception e) {
			throw new Exception("Unable to find Country Text");
		}
	}
	
	public WebElement getCountryTextField() throws Exception{
		log("get Country Text Field");
		getCountryTextElement();
		try {
		return elementsByResourceID(COUNTRYFIELDTEXT).get(0);
		}catch(Exception e) {
			throw new Exception("Unable to find Country Text Feidl");
		}
	}
	
	public List<WebElement> getAutoCompleteCountrySuggestions() throws Exception {
		//**DOES NOT WORK****
		log("get Country Auto Suggestions");
		try {
			return elementsByResourceID(AUTOCOMPLETECOUNTRYSUGGESTIONS);
		}catch(Exception e) {
			throw new Exception ("Unable to find country auto complete suggestions");
		}
	}
	
	//Send Keys Methods
	public void sendKeysToCountryField(String text) throws Exception {
		//WebElement textField = getCountryTextField();
		sendKeysToAutoCompleteField(text, getCountryTextField());
		log(text + " sent to text field");
	}

}
