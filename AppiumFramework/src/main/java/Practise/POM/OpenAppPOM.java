package Practise.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OpenAppPOM {

	public static AndroidDriver<AndroidElement> driver= null;
	
	public  OpenAppPOM(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		
	}
	
	public WebElement Dismiss1() {
		
		WebElement ele=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Dismiss']"));
		
		return ele;
	}
	
	public WebElement Dismiss2() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")"));
		
		return ele;
	}
	
}
