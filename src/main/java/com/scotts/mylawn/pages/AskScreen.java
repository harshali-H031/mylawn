package com.scotts.mylawn.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;
import com.scotts.mylawn.utility.TestUtil;

import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AskScreen extends base
{
	public AskScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Help when you need it')]")
	private static AndroidElement AskTitle;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'My Lawn Care Plan')]")
	private static AndroidElement MLCP;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Feed & Seed Activities')]")
	private static AndroidElement FSAct;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Rainfall Total')]")
	private static AndroidElement RainfallTotal;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'My Lawn Care Plan')]")
	private static AndroidElement OpnMLCP;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Feed & Seed Activities')]")
	private static AndroidElement OpnFSAct;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Rainfall Total')]")
	private static AndroidElement OpnRainfall;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Text Us')]")
	private static AndroidElement TextUs;
	
	public boolean TextPopup()
    {
		return AskScreen.TextUs.isDisplayed();
		
	}
	
	public AskScreen TU()
    {
    	AskScreen.TextUs.click();
    	return new AskScreen();
    }
	
	
	public boolean AskHeader()
    {
		return AskScreen.AskTitle.isDisplayed();
		
	}
	
	public boolean OpenMLCP() 
    {
    	return AskScreen.MLCP.isDisplayed();
    }
	
	public boolean OpenFSA() 
    {
    	return AskScreen.OpnFSAct.isDisplayed();
    }
	
	public boolean OpenRainfallT() 
    {
    	return AskScreen.OpnRainfall.isDisplayed();
    }
	/*
	
	public AskScreen ClickMLCP()
	{
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 //Scroll checkout screen
        String collection = "Rainfall Total";
        dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+
                "new UiSelector().text(\""+collection+"\"));");
		//dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"My Lawn Care Plan\"));"));
		//dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"My Lawn Care Plan\"))");
		//dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Lawn Care Plan\").instance(0))").click();
		AskScreen.MLCP.click();
		//TouchActions action = new TouchActions(dr);
		//action.scroll(MLCP, 10, 100);
		//action.perform();
		return new AskScreen();
	}
	/*public void scrollAndClick(String visibleText) {
	     dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Lawn Care Plan\").instance(0))").click();
	        }
	*/
	
	/*
	public AskScreen ClickFSAct()
	{
		// ScrollDown Function
	    public static void scrollDown() throws InterruptedException {
	        Dimension dimension = dr.manage().window().getSize();
	        Double scrollHeightStart = dimension.getHeight() * 0.7;
	        int scrollStart = scrollHeightStart.intValue();
	        Double scrollHeightEnd = dimension.getHeight() * 0.2;
	        int scrollEnd = scrollHeightEnd.intValue();
	        new TouchAction((PerformsTouchActions) dr).press(PointOption.point(0, scrollStart))
	                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
	                .release().perform();
	        //Thread.sleep(1000);

	    }

	        //Thread.sleep(1000);
		//dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rainfall Total\"));"));
		AskScreen.FSAct.click();
		return new AskScreen();
	
}
*/
	
	public AskScreen ClickRainfall() throws InterruptedException
	{
		TestUtil TU = new TestUtil();
		TU.scrollDown();
		//dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rainfall Total\"));"));
		AskScreen.RainfallTotal.click();
		return new AskScreen();
	}
	
	
	
}
