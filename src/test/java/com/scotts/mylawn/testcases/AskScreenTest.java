package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.AskScreen;
import com.scotts.mylawn.pages.HomeScreen;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.WelcomeScreen;

public class AskScreenTest extends base {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException, InterruptedException 
	{
		System.out.println("Started Server");
		AppLaunch();
		
		WelcomeScreen ws = new WelcomeScreen();
		
		ws.LogTest();
		Login L = new Login();
		L.ScottsLogin(pro.getProperty("SEMAIL"),pro.getProperty("PASSWORD"));

	}
	
/*
	//to verify TextUs is working
	@Test
	
	public void OpenText()
	{
	    HomeScreen HS = new HomeScreen();
	    HS.AskDisplayed();
		AskScreen AS = new AskScreen();
        AS.TU();
		Assert.assertTrue(AS.TextPopup());
	}
	
	
	
	
	//to verify mlcp info is working when selected.

	@Test
	
		public void OpenMLCP()
		{
		    HomeScreen HS = new HomeScreen();
		    dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    HS.AskDisplayed();
			AskScreen AS = new AskScreen();
			
            AS.ClickMLCP();
			Assert.assertTrue(AS.OpenMLCP());
		}

	
	
	//to verify fsa info is working when selected.
	
	@Test
	
	public void OpenFSActivities()
	{
	    HomeScreen HS = new HomeScreen();
	    HS.AskDisplayed();
		AskScreen AS = new AskScreen();
		//dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rainfall Total\"));"));
        AS.ClickFSAct();
		Assert.assertTrue(AS.OpenFSA());
	}
	*/
	
	
	//to verify Rainfall total info is working when selected.
	
		@Test
		
		public void OpenRT() throws InterruptedException
		{
		    HomeScreen HS = new HomeScreen();
		    HS.AskDisplayed();
			AskScreen AS = new AskScreen();
	        AS.ClickRainfall();
			Assert.assertTrue(AS.OpenRainfallT());
		}


}
