package Practise.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LanguagePOM {

	public static AndroidDriver<AndroidElement> driver= null;
	
	public  LanguagePOM(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		
	}
	
	public WebElement Scrollnclick() {
		
		
		//return driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textMatches(\"Select language\"))");
		 //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		//return driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().class(\"android.view.ViewGroup\")).scrollIntoView(new UiSelector().textMatches(\"Select language\").instance(0))"));
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().
	}
	
	
	
	public WebElement English() {
	
		
		return driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"English (default)\")"));	
		
	}
	
	
}
