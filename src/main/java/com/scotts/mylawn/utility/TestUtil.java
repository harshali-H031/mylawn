package com.scotts.mylawn.utility;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mylawn.base.base;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TestUtil extends base {
	public TestUtil()
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}
	
	// ScrollDown Function
	public void scrollDown() throws InterruptedException {
        Dimension dimension = dr.manage().window().getSize();
        Double scrollHeightStart = dimension.getHeight() * 0.7;
        int scrollStart = scrollHeightStart.intValue();
        Double scrollHeightEnd = dimension.getHeight() * 0.2;
        int scrollEnd = scrollHeightEnd.intValue();
        new TouchAction((PerformsTouchActions) dr).press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
                .release().perform();

    }

}
