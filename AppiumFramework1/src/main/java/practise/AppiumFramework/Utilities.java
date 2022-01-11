package practise.AppiumFramework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {

	AndroidDriver<AndroidElement> driver ;
	
	
	public Utilities(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	
	public void scrollText(String text)
	{
	    
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");         

	}
}
	
	

/* scrola igtiyacin oldugunda sadece bu methodu cagirip nereye kadar scrol yapmak istedigini ecommerce sinifindakigibi yapacaksin. asagidaki gibi obje tanimla ve cagir ve texte yapmak istedigin yere kadarki ismi ver
formPage.getcountrySelection().click();
Utilities u = new Utilities(driver);
u.scrollText("Argentina");
*/