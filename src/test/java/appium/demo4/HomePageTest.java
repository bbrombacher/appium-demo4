package appium.demo4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HomePageTest extends AppiumTest{
	
	protected HomePage homePage;
	
	
	@Before
	public void setUpTest() throws Exception {
		super.setUp();
		
		homePage = new HomePage(driver);
	}
	
	@After
	public void tearDownTest() throws Exception {
		super.tearDown();
	}

	@Test
	public void testHomePage() throws Exception{

		AnimationPage animationPage = homePage.openAnimation();
		homePage.back();
		AccessibilityPage accessibilityPage = homePage.openAccessibility();
		homePage.back();
		AppPage appPage = homePage.openApp();
		homePage.back();
		
	}
	

	
	
	
}
