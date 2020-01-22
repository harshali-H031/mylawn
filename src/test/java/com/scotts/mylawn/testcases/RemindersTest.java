package com.scotts.mylawn.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.pages.Login;
import com.scotts.mylawn.pages.RemindersScreen;
import com.scotts.mylawn.pages.WelcomeScreen;
import com.scotts.mylawn.utility.TestCase;

public class RemindersTest extends base
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
	
	@Test (description = TestCase.TC11)
	
	public void ClickReminders()
	{
		RemindersScreen RS = new RemindersScreen();
		RS.SelectReminderMenu();
		Assert.assertTrue(RS.RemindHeader());
		}


}
