package com.scotts.mylawn.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends base {
	
	public Login()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Login')]")
	private static AndroidElement Text;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[@index='0']")
	private static AndroidElement Flogin;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[@index='1']")
	private static AndroidElement Glogin;
	
	/*@CacheLookup
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@text, 'Email')]")
	private static AndroidElement ScoEmail;

	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@text, 'Password')]")
	private static AndroidElement SPwd;
	*/
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.EditText[@index='5']")
	private static AndroidElement ScoEmail;

	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.EditText[@index='6']")
	private static AndroidElement SPwd;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[contains(@text, 'LOG IN')]")
	private static AndroidElement SLogin;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.view.View[@Content-desc, 'Don't have an account yet?']")
	private static AndroidElement NoAcc;
	
    public boolean LoginDisplayed() {
		
		return Login.Text.isDisplayed();
	}
	

	public HomeScreen ScottsLogin(String SEmail, String Pwd) {
		
		
		Login.ScoEmail.sendKeys(SEmail);
		Login.SPwd.sendKeys(Pwd);
		Login.SLogin.click();
		
		return new HomeScreen();
		
	}
	
	
	
}
