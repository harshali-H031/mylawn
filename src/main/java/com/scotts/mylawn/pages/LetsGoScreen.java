package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LetsGoScreen extends base {
	
	public LetsGoScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/btn_lets_go")
	private static AndroidElement LetsGoCTA;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/toolbar_title")
	private static AndroidElement LetsGoTitle;
	

	public boolean LetsGoHeader()
    {
		return LetsGoScreen.LetsGoTitle.isDisplayed();
		
	}
	
	public LawnCondition ClickLetsGo()
	{
		LetsGoScreen.LetsGoCTA.click();
		return new LawnCondition();
	
	}
	
	
	
	
}
