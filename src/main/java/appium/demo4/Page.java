package appium.demo4;

import java.util.List;
import java.lang.Exception;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

	/**
	 * Return an element by locator. Valid locator strategies: xpath, id, class
	 * name, accessibility id, -android uiautomator
	 * 
	 * @param locator
	 * @return
	 * @throws IntertekException 
	 */
	protected WebElement element(By locator) throws Exception  {
		List<WebElement> list = elements(locator);
		
		if (list != null && list.size() > 0) {
			if (list.size() > 1)
				log("there are more elements found with same locator");
			return list.get(0);
		} else
			throw new Exception("Could not find by locator "); // return
																		// null;
	}
	
	/**
	 * Return a list of elements by locator Valid locator strategies: xpath, id,
	 * class name, accessibility id, -android uiautomator
	 * 
	 * @param locator
	 * @return
	 */
	protected List<WebElement> elements(By locator) {
		return driver.findElements(locator);
	}

	public void log(String message) {

		try {
			logger.info(className + " - " + message);
		} catch (Exception e) {
		}
	}
}
