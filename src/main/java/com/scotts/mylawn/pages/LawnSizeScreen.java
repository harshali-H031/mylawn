package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LawnSizeScreen extends base {
	public LawnSizeScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath="android.widget.TextView[contains(@text, 'What’s the size of your lawn? (optional)')]")
	private static AndroidElement LSTitle;
	
	@CacheLookup
	@AndroidFindBy(xpath="android.widget.TextView[contains(@text, 'Calculate my lawn size')]")
	private static AndroidElement LSCal;
	
	@CacheLookup
	@AndroidFindBy(xpath="android.widget.Button[contains(@text, 'CREATE MY LAWN CARE PLAN')]")
	private static AndroidElement CLCP;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp:id/lawn_size")
	private static AndroidElement EnterLS;
	
	public boolean LSSDisplayed() {
		 
    	return LawnSizeScreen.LSTitle.isDisplayed();
	}
	
	public HomeScreen ClickCLCP(String LSize)
	{
		LawnSizeScreen.EnterLS.sendKeys(LSize);
		LawnSizeScreen.CLCP.click();
		return new HomeScreen();
	
	}
	
	
	
	
	
	
	

}
