package appium.demo4;

import io.appium.java_client.AppiumDriver;

public class AssetsPage extends Page {

	public final String READASSET = "Read Asset";
	
	
	public AssetsPage(AppiumDriver driver) throws Exception {
		super(driver);
		className = this.getClass().getSimpleName();
		
	}
	
	
	public ReadAssetPage openReadAssetPage() throws Exception{
		log("openLogTextBox page");
	try {
		elementByText(READASSET).click();
		
	}catch(Exception e){
		throw new Exception("Could not locate Read Asset");
	}
	return new ReadAssetPage(driver);
	}

}
