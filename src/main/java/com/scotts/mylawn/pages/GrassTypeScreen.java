package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GrassTypeScreen extends base {
	
	public GrassTypeScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What's your grass type?')]")
    private static AndroidElement GrassTitle;
	
	
	@CacheLookup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.ImageView")
	private static AndroidElement BahiaGrass;
	
	
	
	/*@CacheLookup
	@AndroidFindBy(xpath="//android.widget.ImageView[contains(@text, 'Bahia')]")
	private static AndroidElement BahiaGrass;
	*/
	
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/action_next")
	private static AndroidElement GrassNext;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp:id/info")
	private static AndroidElement GrassInfo;
	
	
	public boolean GrassDisplayed() {
		 
    	return GrassTypeScreen.GrassTitle.isDisplayed();	
	}
	
	public LetsGoScreen SelectGrass()
	{
		GrassTypeScreen.BahiaGrass.click();
		GrassTypeScreen.GrassNext.click();
		return new LetsGoScreen();
	}
	
	public void ClickInfo()
	{
		GrassTypeScreen.GrassInfo.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}