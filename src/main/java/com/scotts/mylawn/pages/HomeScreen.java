package com.scotts.mylawn.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen extends base {

	public HomeScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}

	@CacheLookup
	@AndroidFindBy(id="android:id/text1")
	private static AndroidElement ActivitiesTab;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/tips")
	private static AndroidElement TipsMenu;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/ask")
	private static AndroidElement AskMenu;
	
	@CacheLookup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
	private static AndroidElement ProfileTab;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/btn_setting")
	private static AndroidElement Settings;

	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/ask")
	private static AndroidElement ClickHere;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/reminder")
    private static AndroidElement RemindersMenu;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/fab")
    private static AndroidElement CustomizePlan;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Scotts® Turf Builder® Summer Lawn Food')]")
    private static AndroidElement AddLawnFood;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/btn_use_product")
    private static AndroidElement ApplyProduct;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/action_add")
    private static AndroidElement AddProduct;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/fab_feed")
    private static AndroidElement SelectFeed;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[contains (@text, 'APPLIED')]")
    private static AndroidElement SelectApplied;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[contains (@text, 'SKIPPED')]")
    private static AndroidElement SelectSkipped;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/answer_1")
    private static AndroidElement SkipReason1;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/btn_positive")
    private static AndroidElement SkipDone;
	
	@CacheLookup
	@AndroidFindBy(id="android:id/button1")
    private static AndroidElement AppliedOk;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/btn_negative")
    private static AndroidElement RatingCancel;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[contains (@text, 'DONE')]")
    private static AndroidElement DidYouKnow;
	
	

	
    public boolean HomeDisplayed() 
      {
    	return HomeScreen.ActivitiesTab.isDisplayed();	
      }
	
	 public LawnTips TipsDisplayed() 
	 {
		 HomeScreen.TipsMenu.click();
		 return new LawnTips();
	  }
	 
	 public AskScreen AskDisplayed()
	 {
		 HomeScreen.AskMenu.click();
		 return new AskScreen(); 
	 }
   
	 public AskScreen AskClick()
	 {
		 dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 HomeScreen.ProfileTab.click();
		 HomeScreen.ClickHere.click();
		 return new AskScreen(); 
	 }
	 
	 public RemindersScreen RemindDisplayed()
	 {
		 HomeScreen.RemindersMenu.click();
		 return new RemindersScreen();
	 }
	
	 public Settings SettingsDisplayed()
	 {
		 dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 HomeScreen.ProfileTab.click();
		 HomeScreen.Settings.click();
		 return new Settings();
		 
	 }
	 
	 public void AddProducts()
	 {
		 HomeScreen.SelectApplied.click();
		 HomeScreen.AppliedOk.click();
		 HomeScreen.RatingCancel.click();
		 HomeScreen.CustomizePlan.click();
		 HomeScreen.SelectFeed.click();
		 HomeScreen.AddLawnFood.click();
		 HomeScreen.ApplyProduct.click();
		 HomeScreen.AddProduct.click();
		 HomeScreen.SelectSkipped.click();
		 HomeScreen.SkipReason1.click();
		 HomeScreen.SkipDone.click();
		 HomeScreen.DidYouKnow.click();
		 
	 }
}
