package com.scotts.mylawn.pages;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.scotts.mylawn.base.base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomeScreen extends base {
	
	public WelcomeScreen()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/btn_create_lawn_care")
	private static AndroidElement SignUp;
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/btn_login")
	private static AndroidElement login;
	
	
	
	/*@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Already have an account? Log In')]")
	private static AndroidElement login;
	*/
	
	public Login LogTest() {
		login.click();
		return new Login();
	}
	
	public SignUp SignupTest() {
		SignUp.click();
		return new SignUp();
		
	}
	
	}

