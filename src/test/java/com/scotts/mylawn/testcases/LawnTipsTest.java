package com.scotts.mylawn.testcases;



import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.HomeScreen;
import com.scotts.mylawn.pages.LawnTips;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.utility.TestCase;

public class LawnTipsTest extends base
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
	
	//to verify hero article is working fine
	@Test (description = TestCase.TC13)
	
    public void OpnHeroArticle()
	{
		HomeScreen HS = new HomeScreen();
		HS.TipsDisplayed();
		LawnTips LT = new LawnTips();
		LT.Hero();
		Assert.assertTrue(LT.ArticleDisplayed());
	}
	
}
