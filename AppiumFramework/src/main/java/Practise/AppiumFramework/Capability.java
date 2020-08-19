package Practise.AppiumFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {

	protected static String appactivity;
	protected  static String apppackage;
	protected static String deviceName;

	public static  AndroidDriver<AndroidElement> Hybridcapability(String appactivity,String apppackage, String deviceName) throws IOException {
		
		
		//FileInputStream filereader = new FileInputStream("C://Users//Administrator//git//mobileFramework1.0//AppiumFramework//src//main//java//global.properties");
		FileReader fis = new FileReader(System.getProperty("user.dir")+"//src//main//java//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
	 apppackage =  prop.getProperty("apppackage");
	 appactivity =  prop.getProperty("appactivity");
	 deviceName = prop.getProperty("deviceName");

		DesiredCapabilities ca = new DesiredCapabilities();
		ca.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		ca.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ca.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, apppackage );
		ca.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,appactivity );
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),ca);
		return driver;
	}

}
