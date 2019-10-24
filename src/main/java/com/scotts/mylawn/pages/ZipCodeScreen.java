package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ZipCodeScreen extends base {
	
	public ZipCodeScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'What’s your ZIP code?')]")
	private static AndroidElement ZipTitle;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/condition")
	private static AndroidElement ZipCode;
	
	
	@CacheLookup
    @AndroidFindBy(id="com.scotts.lawnapp.alpha:id/action_next")
    private static AndroidElement Next;
	
   
	 public boolean ZipDisplayed() {
		 
	    	return ZipCodeScreen.ZipTitle.isDisplayed();	
		}
    
	 public GrassTypeScreen GrassDisplayed(String Group1) 
	 {
	    	ZipCodeScreen.ZipCode.sendKeys(Group1);
	    	ZipCodeScreen.Next.click();
	    	return new GrassTypeScreen(); 
	    	//REMAINING
	    }
   
	
}
