package Practise.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SigninPOM {

	public static AndroidDriver<AndroidElement> driver= null;
	
	public  SigninPOM(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		
	}
	
	public WebElement Signinclick() {
		
		
		//return driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver.findElement(MobileBy.className("android.widget.Button"));
	}
	
	public WebElement Continuewithgoogle() {
	
		
		return driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Continue with Google\")"));	
		
	}
	
	public WebElement Selectaccount() {
	
		
		return driver.findElement(MobileBy.id("com.google.android.gms:id/container"));	
		
	}
	
	
}
