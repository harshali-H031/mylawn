package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.GrassTypeScreen;
import com.scotts.mylawn.pages.LawnCondition;
import com.scotts.mylawn.pages.LetsGoScreen;
import com.scotts.mylawn.pages.SignUp;
import com.scotts.mylawn.pages.SpreaderScreen;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.pages.ZipCodeScreen;
import com.scotts.mylawn.utility.TestCase;

public class LawnConditionTest extends base {
	
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
		ZS.GrassDisplayed(pro.getProperty("GROUP1"));
		
		GrassTypeScreen GS = new GrassTypeScreen();
		GS.SelectGrass();
		
		LetsGoScreen LGS = new LetsGoScreen();
		LGS.ClickLetsGo();
		
	}
	
	//to verify spreader gets displayed once next option is selected.
	
	@Test (description = TestCase.TC08)
	
	public void SelectLCNext()
	{
		LawnCondition LC = new LawnCondition();
		LC.ClickLCNext();  
		SpreaderScreen SS = new SpreaderScreen();
		Assert.assertTrue(SS.SSDisplayed());
		}
	
	
		
	
	
}
