package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SpreaderScreen extends base {
	
	public SpreaderScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath="android.widget.TextView[contains(@text, 'Which spreader do you have?')]")
	private static AndroidElement SSTitle;

	@CacheLookup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView")
	private static AndroidElement SSNext;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp:id/what_is_a_spreader')]")
	private static AndroidElement SSQ;
	
	@CacheLookup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")
	private static AndroidElement SSHandheld;
	
	public boolean SSDisplayed() {
		 
    	return SpreaderScreen.SSTitle.isDisplayed();	
	}
	
	public LawnSizeScreen ClickSSNext()
	{
		SpreaderScreen.SSHandheld.click();
		SpreaderScreen.SSNext.click();
		return new LawnSizeScreen();	
	
	}
	
	
	
}
