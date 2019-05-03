package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class ViewsPage extends Page{

	public final String AUTOCOMPLETE = "Auto Complete";
	public final String EXPANDABLELISTS = "Expandable Lists";
	
	public ViewsPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	//Open Page Methods
	public AutoCompletePage openAutoCompletePage() throws Exception{
		log("open AutoComplete page");
	try {
		elementByText(AUTOCOMPLETE).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate AutoCompletePage");
	}
	return new AutoCompletePage(driver);
	}
	
	public ExpandableListsPage openExpandableListsPage() throws Exception {
		log("openExpandableLists page");
		try {
			scrollIntoView(EXPANDABLELISTS).click();
		}catch(Exception e) {
			throw new Exception ("Could not locate Expandable Lists Page");
		}
		return new ExpandableListsPage(driver);
	}
}
