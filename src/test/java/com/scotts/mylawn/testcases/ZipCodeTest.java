package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.GrassTypeScreen;
import com.scotts.mylawn.pages.LawnCondition;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.SignUp;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.pages.ZipCodeScreen;

public class ZipCodeTest extends base
{
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException, InterruptedException 
	{
		System.out.println("Started Server");
		AppLaunch();
		
		WelcomeScreen ws = new WelcomeScreen();
		
		ws.SignupTest();
		SignUp SU = new SignUp();
		SU.GuestCheck();
		
		
		

	}
	
	//to verify grass type screen gets displayed once zipcode is entered
	@Test
	
    public void VerifyZip() {
		
		ZipCodeScreen ZCS = new ZipCodeScreen();
		ZCS.GrassDisplayed(pro.getProperty("GROUP1"));
		GrassTypeScreen GTS = new GrassTypeScreen();
		Assert.assertTrue(GTS.GrassDisplayed()); //change element
	}
	
	
	
	

	
	
	
	
	
	
}
