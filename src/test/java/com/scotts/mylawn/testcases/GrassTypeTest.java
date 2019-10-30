package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.GrassTypeScreen;
import com.scotts.mylawn.pages.LawnCondition;
import com.scotts.mylawn.pages.LetsGoScreen;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.SignUp;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.pages.ZipCodeScreen;
import com.scotts.mylawn.utility.TestCase;

public class GrassTypeTest extends base
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
		
		ZipCodeScreen ZS = new ZipCodeScreen();
		ZS.GrassDisplayed(pro.getProperty("GROUP1")); //R 12	//one more tc

	}
	
	//to verify Lets go screen gets displayed once grass type is selected.
	
	@Test (description = TestCase.TC06)
	
	public void GrassSelected()
	{
		GrassTypeScreen GS = new GrassTypeScreen();
		GS.SelectGrass();
		LetsGoScreen LG = new LetsGoScreen();
		Assert.assertTrue(LG.LetsGoHeader());			
		
	}
	
	@Test 
	
	public void SelectGrassInfo()
	{
		GrassTypeScreen GS = new GrassTypeScreen();
		GS.ClickInfo();
		//pending assert
		
	}
	
	
}