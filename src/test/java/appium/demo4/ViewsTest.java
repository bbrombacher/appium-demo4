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
		
		/*
		 * 5/3/2019 Popup is not accessible from Appium.
		 * This test requires that Appium finds and clicks an item in a "PopupWindow".
		 * After some research, it seems that this popup does not appear in view XML.
		 * It definitely does not appear when using driver.getPageSource().toString().
		 * Only the items from the page below the popup appear in the output. 
		 */
		homePage = new HomePage(driver);
		ViewsPage viewsPage = homePage.openViewsPage();
		AutoCompletePage autoCompletePage = viewsPage.openAutoCompletePage();
		ScrollPage scrollPage = autoCompletePage.openScrollPage();
		scrollPage.sendKeysToCountryField(SENDCOUNTRYTEXT);
		Thread.sleep(3000);
		System.out.println(scrollPage.getPageSource());
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
