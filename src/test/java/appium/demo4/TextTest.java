package appium.demo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TextTest extends AppiumTest {
	
	protected HomePage homePage; 
	

	
	@Test
	public void testLogTextBox() throws Exception {
		homePage = new HomePage(driver);
		TextPage textPage = homePage.openTextPage();
		LogTextBoxPage logTextBoxPage = textPage.openLogTextBoxPage();
		logTextBoxPage.clickAddButton();
		
		String text = logTextBoxPage.getLogTextBox().getText();
		logTextBoxPage.log("Actual Text: " + text + "Expected Text: " + logTextBoxPage.EXPECTEDLOGTEXT);
		
		Assert.assertEquals(text, logTextBoxPage.EXPECTEDLOGTEXT);
		
	
	}
}
