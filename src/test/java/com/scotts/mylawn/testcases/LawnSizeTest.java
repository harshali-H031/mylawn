package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.GrassTypeScreen;
import com.scotts.mylawn.pages.HomeScreen;
import com.scotts.mylawn.pages.LawnCondition;
import com.scotts.mylawn.pages.LawnSizeScreen;
import com.scotts.mylawn.pages.LetsGoScreen;
import com.scotts.mylawn.pages.SignUp;
import com.scotts.mylawn.pages.SpreaderScreen;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.pages.ZipCodeScreen;
import com.scotts.mylawn.utility.TestCase;

public class LawnSizeTest extends base
{
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException, InterruptedException 
	{
		System.out.println("Started Server");
		AppLaunch();
		
        WelcomeScreen ws = new WelcomeScreen();
		
        ws.SignupTest();
		SignUp SU = new SignUp();
		//SU.GuestCheck();
		SU.ScottsSignup(pro.getProperty("SEMAIL"), (pro.getProperty("PASSWORD")));
		
		ZipCodeScreen ZS = new ZipCodeScreen();
		ZS.GrassDisplayed(pro.getProperty("GROUP1"));
		
		GrassTypeScreen GS = new GrassTypeScreen();
		GS.SelectGrass();
		
		
		LetsGoScreen LGS = new LetsGoScreen();
		LGS.ClickLetsGo();
		
		LawnCondition LC = new LawnCondition();
		LC.ClickLCNext();
		
		SpreaderScreen SS = new SpreaderScreen();
		SS.ClickSSNext();
		
	}
		
	//To verify lawn care plan is created 
	
	@Test (description = TestCase.TC10)
	
	public void SelectCMLCP()
	{
		LawnSizeScreen LSS = new LawnSizeScreen();
		LSS.ClickCLCP(pro.getProperty("LSIZE"));
		
		HomeScreen HS = new HomeScreen();
		HS.AddProducts();
		Assert.assertTrue(HS.HomeDisplayed());
		}

}
