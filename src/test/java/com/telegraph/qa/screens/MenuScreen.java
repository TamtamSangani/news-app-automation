package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuScreen extends SharedDriver {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Preprod\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther")
    @AndroidFindBy(id = "")
    private MobileElement Notification;

    @iOSXCUITFindBy(id = "Send me updates")
    @AndroidFindBy(id = "")
    private MobileElement sendMeUpdates;

    @iOSXCUITFindBy(id = "Allow")
    @AndroidFindBy(id = "")
    private MobileElement deviceNotification;

    public MenuScreen () { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getNotification() { return Notification; }
    public MobileElement getSendMeUpdates() { return sendMeUpdates; }
    public MobileElement getDeviceNotification() { return deviceNotification; }

    public void isNotificationDisplayed () { isElementVisible(Notification);}
    public void isSendMeUpdatesDisplayed () { isElementVisible(sendMeUpdates);}
    public void isDeviceNotificationDisplayed () { isElementVisible(deviceNotification);}

    public void clickSendMeUpdates (){click(sendMeUpdates);}
    public void clickDeviceNotification () {click(deviceNotification);}

    public void swipeDownPage () {swipe(Direction.DOWN);}

}
