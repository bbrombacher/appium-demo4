package appium.demo4;

import java.util.List;
import java.lang.Exception;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
	protected static final Logger logger = LoggerFactory.getLogger(Page.class);
	protected String className;
	
	protected static final String PACKAGE_NAME = "io.appium.android.apis:id/";
	
	
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
			logger.info(className + " - " + message);
		} catch (Exception e) {
		}
	}
	
	
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
	
	protected List<WebElement> elementsByText(String text) {
		return androidDriver.findElementsByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")");
	}
	
	/**
	 * Press the system back button
	 */
	public void back() {
	
	}
	
}
