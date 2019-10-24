package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LawnTips extends base
{
	public LawnTips()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	//(xpath="//android.widget.TextView[contains(@text, 'Lawn Tips')]")
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/tips")
	private static AndroidElement TipsTitle;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/hero_image")
	private static AndroidElement HeroImage;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Articles')]")
	private static AndroidElement Articles;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Videos')]")
	private static AndroidElement Videos;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"EARLY SUMMER\"]")
	private static AndroidElement OpnArticle;
	
    @CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/icon")
	private static AndroidElement TipsMenu;
	
	
	
    public boolean TipsHeader()
    {
		return LawnTips.TipsTitle.isDisplayed();
	}
	
    public boolean ArticleDisplayed() 
    {
    	return LawnTips.OpnArticle.isDisplayed();
    }
    
    public void Hero()
    {
    	LawnTips.HeroImage.click();
    }


	
	
	
	
	
	
	
}

