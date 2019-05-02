package appium.demo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ContentTest extends AppiumTest {

	protected HomePage homePage;
	
	@Test
	public void testReadAsset() throws Exception {
		homePage = new HomePage(driver);
		ContentPage contentPage = homePage.openContentPage();
		AssetsPage assetsPage = contentPage.openAssetsPage();
		ReadAssetPage readAssetPage = assetsPage.openReadAssetPage();
		
		String text = readAssetPage.getAssetTextBox().getText();
		readAssetPage.log("Actual " + text + " Expected " + readAssetPage.EXPECTEDASSETTEXT);
		
		Assert.assertEquals(text, readAssetPage.EXPECTEDASSETTEXT);
	}
}