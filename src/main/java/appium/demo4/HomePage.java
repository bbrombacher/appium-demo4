package appium.demo4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class HomePage extends Page{

	public final String ACCESSIBILITY = "Accessibility";
	public final String ANIMATION = "Animation";
	public final String APP = "App";
	public final String CONTENT = "Content";
	public final String GRAPHICS = "Graphics";
	public final String MEDIA = "Media";
	public final String NFC = "NFC";
	public final String OS = "OS";
	public final String PREFERENCES = "Preferences";
	public final String TEXT = "Text";
	
	
	public HomePage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	public AccessibilityPage openAccessibility() throws Exception{
		log("openAccessibility page");
	try {
		elementByText(ACCESSIBILITY).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Accessability");
	}
	return new AccessibilityPage(driver);
	
	
	}
	
	public AnimationPage openAnimation() throws Exception{
		log("openAnimation page");
	try {
		elementByText(ANIMATION).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Animation");
		}
	return new AnimationPage(driver);
	}
	
	
	public AppPage openApp() throws Exception{
		log("openApp page");
	try {
		elementByText(APP).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Animation");
		}
	return new AppPage(driver);
	}
	
}
