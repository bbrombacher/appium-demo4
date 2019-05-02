package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class TextPage extends Page{

	public final String LOGTEXTBOX = "LogTextBox";
	
	public TextPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	public LogTextBoxPage openLogTextBoxPage() throws Exception{
		log("openLogTextBox page");
	try {
		elementByText(LOGTEXTBOX).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate LogTextBox");
	}
	return new LogTextBoxPage(driver);
	}
	
}
