package appium.demo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class PreferenceTest extends AppiumTest {

	protected HomePage homePage;
	
	public final String TIGER = "tiger";
	/*
	@Before
	public void setUpTest() throws Exception {
		super.setUp();
		homePage = new HomePage(driver);
	}
	
	@After
	public void tearDownTest() throws Exception {
		super.tearDown();
	}
	*/
	@Test
	public void testPreferencesTextField() throws Exception {
		homePage = new HomePage(driver);
		PreferencePage preferencePage = homePage.openPreferencePage();
		PreferencesFromXMLPage preferencesFromXMLPage = preferencePage.openPreferencesFromXMLPage();
		
		preferencesFromXMLPage.clickEditTextPreferencesButton();
		preferencesFromXMLPage.clearTextField();
		preferencesFromXMLPage.sendKeysToTextField(TIGER);
		preferencesFromXMLPage.clickOKButton();
		preferencesFromXMLPage.clickEditTextPreferencesButton();
		
		String text = preferencesFromXMLPage.getTextField().getText();
		preferencesFromXMLPage.log("Actual Text: " + text + " Expected Text: " + TIGER);
		Assert.assertEquals(text, TIGER);
		
		
	}
	
}
