package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.WelcomeScreen;

public class SettingsTest extends base
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
	
	
}
