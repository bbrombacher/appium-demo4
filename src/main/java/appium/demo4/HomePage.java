package appium.demo4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class HomePage extends Page{

	public final String APIDEMOS = "API Demos";
	public final String ACCESSIBILITY = "Accessibility";
	public final String ANIMATION = "Animation";
	public final String APP = "App";
	public final String CONTENT = "Content";
	public final String GRAPHICS = "Graphics";
	public final String MEDIA = "Media";
	public final String NFC = "NFC";
	public final String OS = "OS";
	public final String PREFERENCE = "Preference";
	public final String TEXT = "Text";
	public final String VIEWS = "Views";
	
	
	public HomePage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	//Get Elements
	public WebElement getToolBar() throws Exception{
		log("getToolBar WebElement");
		try {
			WebElement toolBar = elementByText(APIDEMOS);
			return toolBar;
		}catch(Exception e) {
			throw new Exception("Could not locate homepage toolbar: " + APIDEMOS);
		}
		
	}
	
	
	//Open Pages
	
	public AccessibilityPage openAccessibilityPage() throws Exception{
		log("openAccessibility page");
	try {
		elementByText(ACCESSIBILITY).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Accessability");
	}
	return new AccessibilityPage(driver);
	
	
	}
	
	public AnimationPage openAnimationPage() throws Exception{
		log("openAnimation page");
	try {
		elementByText(ANIMATION).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Animation");
		}
	return new AnimationPage(driver);
	}
	
	
	public AppPage openAppPage() throws Exception{
		log("openApp page");
	try {
		elementByText(APP).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate App Page");
		}
	return new AppPage(driver);
	}

	
	public ContentPage openContentPage() throws Exception{
		log("openContent page");
	try {
		elementByText(CONTENT).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Content Page");
		}
	return new ContentPage(driver);
	}
	
	//openGraphicsPage
	public GraphicsPage openGraphicsPage() throws Exception{
		log("openGraphics Page");
		try {
			elementByText(GRAPHICS).click();

		}catch(Exception e) {
			throw new Exception("Could not locate Graphics Page");
		}
		return new GraphicsPage(driver);
	}
	
	//openMediaPage
	public MediaPage openMediaPage() throws Exception{
		log("openMedia Page");
		try {
			elementByText(MEDIA).click();

		}catch(Exception e) {
			throw new Exception("Could not locate Media Page");
		}
		return new MediaPage(driver);
	}
	
	//openNFCPage
	public NFCPage openNFCPage() throws Exception{
		log("openNFC Page");
		try {
			elementByText(NFC).click();

		}catch(Exception e) {
			throw new Exception("Could not locate NFC Page");
		}
		return new NFCPage(driver);
	}
	
	//openOSPage
	public OSPage openOSPage() throws Exception{
		log("openOS Page");
		try {
			elementByText(OS).click();

		}catch(Exception e) {
			throw new Exception("Could not locate OS Page");
		}
		return new OSPage(driver);
	}
	
	//openPreferencePage
	public PreferencePage openPreferencePage() throws Exception{
		log("openPreference Page");
		try {
			elementByText(PREFERENCE).click();

		}catch(Exception e) {
			throw new Exception("Could not locate Preference Page");
		}
		return new PreferencePage(driver);
	}
	
	//openTextPage
	public TextPage openTextPage() throws Exception{
		log("openText Page");
		try {
			elementByText(TEXT).click();

		}catch(Exception e) {
			throw new Exception("Could not locate Text Page");
		}
		return new TextPage(driver);
	}
	//openViewsPage
	public ViewsPage openViewsPage() throws Exception{
		log("openViews Page");
		try {
			elementByText(VIEWS).click();

		}catch(Exception e) {
			throw new Exception("Could not locate Views Page");
		}
		return new ViewsPage(driver);
	}
	
}
