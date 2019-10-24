package com.scotts.mylawn.pages;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUp extends base
{
	
	public SignUp()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id="com.scotts.lawnapp.alpha:id/action_continue_as_guest")
	private static AndroidElement Guest;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[contains(@text, 'Facebook')]")
	private static AndroidElement FSignUp;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[contains(@text, 'Google')]")
	private static AndroidElement GSignUp;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@index, '1')]")
	private static AndroidElement SEmail;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@index, '2')]")
	private static AndroidElement Pwd;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@index, '3')]")
	private static AndroidElement CPwd;
		
	@CacheLookup
	@AndroidFindBy(xpath= "//android.widget.Button[contains(@content-desc, 'CREATE ACCOUNT')]")
	private static AndroidElement ScoAcc;
	
	@CacheLookup
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Sign Up')]")
	private static AndroidElement SText;
	
	
	
	 public static boolean SignUpDisplayed() {
	    	
			return SignUp.SText.isDisplayed();	
		}
	 
	 //static before zipcodescreen
	 public ZipCodeScreen GuestCheck() {
	    	SignUp.Guest.click();
	    	return new ZipCodeScreen();
	    }
	 

		public ZipCodeScreen ScottsSignup(String SEmail, String Pwd) {
			
			SignUp.SEmail.sendKeys(SEmail);
			SignUp.Pwd.sendKeys(Pwd);
			SignUp.CPwd.sendKeys(Pwd);
			SignUp.ScoAcc.click();
			return new ZipCodeScreen();
			
		}
		
	 
	 
	}



