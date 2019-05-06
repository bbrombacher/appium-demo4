package appium.demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;


import io.appium.java_client.AppiumDriver;

public class SimpleAdapterPage extends Page{

	public final String GROUPNUMBER = "Group ";
	
	public final ArrayList<String> expectedSimpleAdapterListView = new ArrayList<String>(
		    Arrays.asList("Group 0", "Group 1", "Group 2", "Group 3", "Group 4", "Group 5",
		    		"Group 6", "Group 7", "Group 8", "Group 9", "Group 10", "Group 11",
		    		"Group 12", "Group 13", "Group 14", "Group 15", "Group 16", "Group 17",
		    		"Group 18", "Group 19"));
	
	public SimpleAdapterPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	public void clickListButton(int number) throws Exception{
		log("clickList Button " + number);
		getListButtonByIndexName(number).click();
	}
	
	public WebElement getListButtonByIndexName(int number) throws Exception {
		//log("getEditTextPreferences WebElement");
		String text = GROUPNUMBER+number;
		try {
			WebElement listWebElement = elementByText(text);
			return listWebElement;
		}catch(Exception e) {
			throw new Exception("Could not locate: " + text);
		}
		
	}
	
	public boolean verifyTopLevelList() throws Exception {
		List<String> actualListText = new ArrayList<String>();
		log("verify top level list");
		
		for(int i = 0; i<20; i++) {
			actualListText.add(getListButtonByIndexName(i).getText());
			clickListButton(i);
			clickListButton(i);	
		}
		return expectedSimpleAdapterListView.containsAll(actualListText);
	}
	
}
