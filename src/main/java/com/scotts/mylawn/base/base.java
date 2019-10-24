package com.scotts.mylawn.base;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	public static AndroidDriver<MobileElement> dr;
	public static Properties pro;
	public static DesiredCapabilities caps;

	
	
	
	public base()
	{
		//String str =null;
	       try {
	           // Load the properties File
	            pro= new Properties();
	           File fl= new File ("C:\\Users\\Heady\\eclipse-workspace\\MyLawn\\constant.properties");
	            //File fl= new File("C:/Users/Heady/eclipse-workspace/mylawnscripts/"+"C:\\Users\\Heady\\git\\Scotts-scripts2\\mylawnscripts\\constant.properties");
	           FileInputStream fis = new FileInputStream(fl);
	           pro.load(fis);
	//public static String proReader (String PropertyName)
	           
	        }
	       catch(Exception e)
	       {
	    	   e.printStackTrace();
	       }
	}
	
	
	
	public static void AppLaunch() throws MalformedURLException, InterruptedException
	{
		caps = new DesiredCapabilities();
        //DesiredCapabilities caps = new DesiredCapabilities();

        //App launch
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, pro.getProperty("deviceName"));
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, pro.getProperty("PLATFORM_VERSION"));
        caps.setCapability(MobileCapabilityType.UDID, pro.getProperty("UDID"));
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, pro.getProperty("automationName"));
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        //caps.setCapability(MobileCapabilityType.RESET,true);
        caps.setCapability("Reset", "true");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.scotts.lawnapp.alpha");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.scotts.lawnapp.ui.onboarding.OnboardingActivity");
        
        System.out.println("Listening at URL: " + pro.getProperty("URL") + ":" + pro.getProperty("PORT") + "/wd/hub");
		try {
			dr = new AndroidDriver<MobileElement>(
					new URL(pro.getProperty("URL") + ":" + pro.getProperty("PORT") + "/wd/hub"), caps);
		} catch (MalformedURLException e) {
			System.out.println("Exception on Connection is: " + e);
		}
		System.out.println(
				"DriverIntialized at: " + pro.getProperty("URL") + ":" + pro.getProperty("PORT") + "/wd/hub");
		//dr.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//dr.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


	}

     
	}


