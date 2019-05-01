package appium.demo4;

import java.util.List;
import java.lang.Exception;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/*
 * Appium Selector Reference: http://appium.io/docs/en/commands/element/find-elements/
 * Google UISelector Reference: https://developer.android.com/reference/android/support/test/uiautomator/UiSelector.html
 * For Android, use androidDriver.findElementsByAndroidUIAutomator(); see references
 */

public class Page {
	
	/*
	 * define appium driver for both Android and iOS platforms
	 */
	protected AppiumDriver driver;
	
	/*
	 * define mobile driver for Android platform
	 */
	protected AndroidDriver androidDriver;
	
	/*
	 * declare a logger
	 */
	//protected static final Logger logger = LoggerFactory.getLogger(Page.class);
	private static final Logger logger = LogManager.getLogger(Page.class);
	protected String className;
	
	protected static final String PACKAGE_NAME = "io.appium.android.apis";
	
	
	/**
	 * page constructor. all sub classes must add followings to their
	 * constructor super(driver); className = this.getClass().getSimpleName();
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public Page(AppiumDriver driver) throws Exception {
		this.driver = driver;
		androidDriver = (AndroidDriver) driver;
		// iOSDriver = (IOSDriver)driver;
	}

	public void log(String message) {

		try {
			logger.error(className + " - " + message);
		} catch (Exception e) {
		}
	}
	
	/*
	 * Find and return a single WebElement based on it's text.
	 */
	protected WebElement elementByText(String text) throws Exception {

		List<WebElement> list = elementsByText(text);
		if (list != null && list.size() > 0) {
			if (list.size() > 1)
				log("there are more elements found with same Text: " + text);
			return list.get(0);
		} else
			throw new Exception("Could not find text: " + text); // return
																			// null;
	}
	/*
	 * Find and return a list of WebElements based on the text.
	 */
	protected List<WebElement> elementsByText(String text) {
		return androidDriver.findElementsByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")");
	}

	
	/*
	 * Find a single element by using the Resrouce ID.
	 * Likely should not be used since when using a Resrouce ID, there will usually be more than one.
	 */
	protected WebElement elementByResourceID(String ID) throws Exception {

		List<WebElement> list = elementsByText(ID);
		if (list != null && list.size() > 0) {
			if (list.size() > 1)
				log("there are more elements found with same ID: " + ID);
			return list.get(0);
		} else
			throw new Exception("Could not find ID: " + ID); // return
	}
	
	/*
	 * Find a web element by using .resourceIdMatches(). When provide the ID, only provide the :id/[idname].
	 * Replace [idname] with the id name.
	 * Do not provide the whole package name.
	 */
	protected List<WebElement> elementsByResourceID(String ID) {
		return androidDriver.findElementsByAndroidUIAutomator("new UiSelector().resourceIdMatches(\".*" + ID + "\")");
		
	}
	

	
	
	//Buttons and Touch Services
	/**
	 * Press the system back button
	 */
	public void back() {
	log("back");
	androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	protected WebElement scrollIntoView(String view) {
		return androidDriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""
						+ view + "\").instance(0)) ");

	}
}
