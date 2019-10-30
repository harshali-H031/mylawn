package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.HomeScreen;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.utility.TestCase;

public class LoginTest extends base {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException, InterruptedException {
		System.out.println("Started Server");
		AppLaunch();
	}
	
	
	
	@Test  (description = TestCase.TC02)
	
        public void LogScotAcc() {
		
		WelcomeScreen ws = new WelcomeScreen();
		ws.LogTest();
		Login L = new Login();
		L.ScottsLogin(pro.getProperty("SEMAIL"),pro.getProperty("PASSWORD"));
		HomeScreen HS = new HomeScreen();
		Assert.assertTrue(HS.HomeDisplayed());
	}  

}
