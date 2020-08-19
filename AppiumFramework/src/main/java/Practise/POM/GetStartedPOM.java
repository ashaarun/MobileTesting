package Practise.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GetStartedPOM {

	public static AndroidDriver<AndroidElement> driver= null;
	
	public  GetStartedPOM(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		
	}
	
	public WebElement getstarted() {
		
		
		//return driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Get started\")"));
	}
	
	
	
	public WebElement Class9() {
	
	
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Class 9\"))");
		
	}
	

	public WebElement SelectCourses() {
	
	
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Class 9 math (India)\"))").click();
		 
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pre-algebra\"))").click();
		  
		  return driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Done\")"));
		 
		
	}
	
	
}
