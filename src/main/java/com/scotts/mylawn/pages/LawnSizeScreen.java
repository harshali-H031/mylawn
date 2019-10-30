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
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")
	private static AndroidElement CLCP;
	
	@CacheLookup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private static AndroidElement EnterLS;
	
	public boolean LSSDisplayed() {
		 
    	return LawnSizeScreen.LSTitle.isDisplayed();
	}
	
	public HomeScreen ClickCLCP(String Lsize)
	{
		LawnSizeScreen.EnterLS.sendKeys(Lsize);
		LawnSizeScreen.CLCP.click();
		return new HomeScreen();
	
	}
	
	
	
	
	
	
	

}
