package Practise.AppiumFramework;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Practise.POM.OpenAppPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01 extends Capability{

	public static AndroidDriver<AndroidElement> driver = null;
	public static OpenAppPOM openappPom = null;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		System.out.println("<<<<<<<<<<<Before test>>>>>>>>>>");
		driver = Hybridcapability(appactivity, apppackage,deviceName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		openappPom=new OpenAppPOM(driver);
		
		
	}
	
	@Test
	public void OpenApp() throws IOException
	{
		
		openappPom.Dismiss1().click();
		System.out.println("Covid dismiss next");
		openappPom.Dismiss2().click();
		System.out.println("Covid dismiss done");
		 
	
		}

}
