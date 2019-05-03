package appium.demo4;

import io.appium.java_client.AppiumDriver;

public class AutoCompletePage extends Page {

	public final String SCROLLPAGE = "3. Scroll";
	public final String EXPANDABLELISTSPAGE = "Expandable Lists";
	
	public AutoCompletePage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
	}
	
	// Open Page methods
	public ScrollPage openScrollPage() throws Exception{
		log("open Scroll page");
	try {
		elementByText(SCROLLPAGE).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Scroll Page");
	}
	return new ScrollPage(driver);
	}
	
}
