package appium.demo4;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class ReadAssetPage extends Page {
	
	public final String ASSETTEXTBOX = ":id/text";
	public final String EXPECTEDASSETTEXT = "This text is stored in a raw Asset.\n\nIt was read and placed into the TextView here.\n";
	
	public ReadAssetPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	//Get Methods
	public WebElement getAssetTextBox() throws Exception {
		//log("getAssetText");
		try {
			List<WebElement> logText = elementsByResourceID(ASSETTEXTBOX);
			return logText.get(0);
		}catch(Exception e) {
			throw new Exception("Could not colate : " + ASSETTEXTBOX);
		}
	}

}
