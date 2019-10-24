package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LawnCondition extends base {
	
	public LawnCondition()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath="android.widget.TextView[contains(@text, 'What is your lawn condition?')]")
	private static AndroidElement LCTitle;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp:id/action_next')]")
	private static AndroidElement LCNext;
	
	
	public boolean LCDisplayed() {
		 
    	return LawnCondition.LCTitle.isDisplayed();	
	}
	
	public SpreaderScreen ClickLCNext()
	{
		LawnCondition.LCNext.click();
		return new SpreaderScreen();
	
	}
	
}
	
