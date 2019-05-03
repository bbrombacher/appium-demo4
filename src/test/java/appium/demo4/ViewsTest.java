package appium.demo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ViewsTest extends AppiumTest {

	protected HomePage homePage;
	public final String SENDCOUNTRYTEXT = "Unit";
	
	@Test
	public void testAutoCompleteList() throws Exception {
		homePage = new HomePage(driver);
		ViewsPage viewsPage = homePage.openViewsPage();
		AutoCompletePage autoCompletePage = viewsPage.openAutoCompletePage();
		ScrollPage scrollPage = autoCompletePage.openScrollPage();
		scrollPage.sendKeysToCountryField(SENDCOUNTRYTEXT);
		Thread.sleep(3000);
		//Remaining task: 
		//implement method to find elements from an auto suggestion popup
		//Click United States
		//Verify United States now appears in the text field.
		
	}
	
	//@Test
	public void testSimpleAdapter() throws Exception {
		homePage = new HomePage(driver);
		ViewsPage viewsPage = homePage.openViewsPage();
		ExpandableListsPage expandableListsPage = viewsPage.openExpandableListsPage();
		
	}
}
