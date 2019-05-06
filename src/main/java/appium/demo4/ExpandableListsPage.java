package appium.demo4;

import io.appium.java_client.AppiumDriver;

public class ExpandableListsPage extends Page{
	
	public final String SIMPLEADAPTER = "3. Simple Adapter";

	public ExpandableListsPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	public SimpleAdapterPage openSimpleAdapterPage() throws Exception{
		log("open Simple Adapter page");
	try {
		elementByText(SIMPLEADAPTER).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Simple Adapter Page");
	}
	return new SimpleAdapterPage(driver);
	}
}
