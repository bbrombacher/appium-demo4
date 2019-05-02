package appium.demo4;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;


public class LogTextBoxPage extends Page {
	
	public final String ADDBUTTON = "ADD";
	public final String LOGTEXTBOX = ":id/text";
	public final String EXPECTEDLOGTEXT = "This is a test\n";

	public LogTextBoxPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	//Click Methods
	public void clickAddButton() throws Exception {
		getAddButton().click();
		log("click " + ADDBUTTON + "button");
		
	}
	
	//Get Methods
	public WebElement getAddButton() throws Exception {
		//log("getTextField WebElement");
		try {
			WebElement addButton = elementByText(ADDBUTTON);
			return addButton;
		}catch(Exception e) {
			throw new Exception("Coud not loate: " + ADDBUTTON);
		}
	}
	
	public WebElement getLogTextBox() throws Exception {
		//log("getLogText WebElement");
		try {
			List<WebElement> logText = elementsByResourceID(LOGTEXTBOX);
			return logText.get(0);
		}catch(Exception e) {
			throw new Exception("Could not colate : " + LOGTEXTBOX);
		}
	}
	
}
