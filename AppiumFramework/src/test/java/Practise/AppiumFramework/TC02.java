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
import Practise.POM.SigninPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC02 extends Capability{

	public static AndroidDriver<AndroidElement> driver = null;
	public static OpenAppPOM openappPom = null;
	public static SigninPOM signinPom = null;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		System.out.println("<<<<<<<<<<<Before test>>>>>>>>>>");
		driver = Hybridcapability(appactivity, apppackage,deviceName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		openappPom=new OpenAppPOM(driver);
		signinPom=new SigninPOM(driver);
		
		
		
	}
	
	@Test
	public void OpenApp() throws IOException
	{
		
		openappPom.Dismiss1().click();
		System.out.println("Covid dismiss next");
		openappPom.Dismiss2().click();
		System.out.println("Covid dismiss done");
		 
	
		}
	@Test (dependsOnMethods= {"OpenApp"})
	public void Login() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("sign in  to be clicked");
		signinPom.Signinclick().click();
		System.out.println("sign in  clicked");
		signinPom.Continuewithgoogle().click();
		signinPom.Selectaccount().click();
		
	}
	
	

}
