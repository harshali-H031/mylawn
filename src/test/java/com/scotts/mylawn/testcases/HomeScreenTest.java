package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.AskScreen;
import com.scotts.mylawn.pages.HomeScreen;
import com.scotts.mylawn.pages.LawnTips;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.RemindersScreen;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.utility.TestCase;


public class HomeScreenTest extends base 
{

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
	
	
	@Test (description = TestCase.TC12)
	
	
       public void TipsVisible()
	{
		
		HomeScreen HS = new HomeScreen();
		HS.TipsDisplayed();
		LawnTips LT = new LawnTips();
		Assert.assertTrue(LT.TipsHeader());
	}
	

	
	@Test (description = TestCase.TC14)
	
		public void AskVisible()
		{
		HomeScreen HS = new HomeScreen();
		HS.AskDisplayed();
		AskScreen AS = new AskScreen();
		Assert.assertTrue(AS.AskHeader());
		}
		
	
		
	 
	//to verify ask is displayed when click here option is selected.
	
	@Test (description = TestCase.TC15)
	
	public void ClickHere()
	
	{

	HomeScreen AT = new HomeScreen();
	AT.AskClick();
	AskScreen AP = new AskScreen();
	Assert.assertTrue(AP.AskHeader());
	}


	
	//to verify reminders screen is displayed when Reminders menu is selected.
	
	@Test (description = TestCase.TC11)
	
	public void RemindVisible()
	{
		HomeScreen AH = new HomeScreen();
		AH.RemindDisplayed();
		RemindersScreen RS = new RemindersScreen();
        Assert.assertTrue(RS.RemindHeader());		
	}
	
}
