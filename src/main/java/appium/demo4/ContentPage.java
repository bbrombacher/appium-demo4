package appium.demo4;

import io.appium.java_client.AppiumDriver;


public class ContentPage extends Page{

	public final String ASSETS = "Assets";
	
	public ContentPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	public AssetsPage openAssetsPage() throws Exception{
		log("openAssets page");
	try {
		elementByText(ASSETS).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate AssetsPage");
	}
	return new AssetsPage(driver);
	}
	
}
