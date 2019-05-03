package appium.demo4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HomePageTest extends AppiumTest{
	
	protected HomePage homePage;
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
	public void testHomePage() throws Exception {
		//click all home page buttons one by one.
		homePage = new HomePage(driver);
		AccessibilityPage accessibilityPage = homePage.openAccessibilityPage();
		homePage.back();
		AnimationPage animationPage = homePage.openAnimationPage();
		homePage.back();
		AppPage appPage = homePage.openAppPage();
		homePage.back();
		ContentPage contentPage = homePage.openContentPage();
		homePage.back();
		GraphicsPage graphicsPage = homePage.openGraphicsPage();
		homePage.back();
		MediaPage mediaPage = homePage.openMediaPage();
		homePage.back();
		NFCPage nfcPage = homePage.openNFCPage();
		homePage.back();
		OSPage osPage = homePage.openOSPage();
		homePage.back();
		PreferencePage preferencePage = homePage.openPreferencePage();
		homePage.back();
		TextPage textPage = homePage.openTextPage();
		homePage.back();
		
		ViewsPage viewsPage = homePage.openViewsPage();
		homePage.back();
		
		Assert.assertEquals(homePage.APIDEMOS, homePage.getToolBar().getText());
		
	}
	
}
