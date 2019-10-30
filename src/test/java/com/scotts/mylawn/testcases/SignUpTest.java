package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.SignUp;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.pages.ZipCodeScreen;
import com.scotts.mylawn.utility.TestCase;

public class SignUpTest extends base {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException, InterruptedException {
		System.out.println("Started Server");
		AppLaunch();
		
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WelcomeScreen ws = new WelcomeScreen();
		
		ws.SignupTest();

	}
	
	
	@Test (description = TestCase.TC01)
	
	public void SScotAcc() {
		
		SignUp SU = new SignUp();
		SU.ScottsSignup(pro.getProperty("SEMAIL"),pro.getProperty("PASSWORD"));
		ZipCodeScreen ZS = new ZipCodeScreen();
		Assert.assertTrue(ZS.ZipDisplayed());
	}
		
	}