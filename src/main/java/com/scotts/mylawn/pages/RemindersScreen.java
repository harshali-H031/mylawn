package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RemindersScreen extends base 

{
	public RemindersScreen()
	{
	
			super();
			PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	
	}
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/reminder")
    private static AndroidElement RemindersMenu;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Reminders')]")
    private static AndroidElement RemindTitle;
	
	public boolean RemindHeader()
    {
		return RemindersScreen.RemindTitle.isDisplayed();
		
	}
	
	public void SelectReminderMenu()
	{
		RemindersScreen.RemindersMenu.click();
		
	}
	

}
