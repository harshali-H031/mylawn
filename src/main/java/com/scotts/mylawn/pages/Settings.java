package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Settings extends base
{
	public Settings()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}

	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What's your grass type?')]")
    private static AndroidElement AMLP;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What's your grass type?')]")
    private static AndroidElement TC;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What's your grass type?')]")
    private static AndroidElement Privacy;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What's your grass type?')]")
    private static AndroidElement OpenAMLP;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What's your grass type?')]")
    private static AndroidElement OpenTC;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What's your grass type?')]")
    private static AndroidElement OpenPrivacy;
	
	public boolean OpenAMLP() 
    {
    	return Settings.OpenAMLP.isDisplayed();
    }
	
	public boolean OpenTC() 
    {
    	return Settings.OpenTC.isDisplayed();
    }
	
	public boolean OpenPrivacy() 
    {
    	return Settings.OpenPrivacy.isDisplayed();
    }
	
	public void SelectAMLP()
	{
		Settings.AMLP.click();
	}
	
	public void SelectTC()
	{
		Settings.TC.click();
	}

	public void SelectPrivacy()
	{
		Settings.Privacy.click();
	}

}

