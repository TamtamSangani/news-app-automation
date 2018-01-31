package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenuPageScreen extends SharedDriver {


    private String TopStories = "TopStories";


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Preprod\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther")
    @AndroidFindBy(id = "")
    private MobileElement notification;

    @iOSXCUITFindBy(id = "Send me updates")
    @AndroidFindBy(id = "")
    private MobileElement sendMeUpdates;

    @iOSXCUITFindBy(id = "Allow")
    @AndroidFindBy(id = "")
    private MobileElement deviceNotification;

    @iOSXCUITFindBy(id = "menuButton")
    @AndroidFindBy(id = "")
    private MobileElement menuButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"sectionHeader\"])[1]")
    @AndroidFindBy(id = "")
    private MobileElement topStories;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"sectionHeader\"])[2]")
    @AndroidFindBy(id = "")
    private MobileElement news;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"sectionHeader\"])[3]")
    @AndroidFindBy(id = "")
    private MobileElement politics;

    @iOSXCUITFindBy(tagName = "")
    @AndroidFindBy(id = "")
    private List<MobileElement> menuList;

    public MenuPageScreen () { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getNotification() { return notification; }
    public MobileElement getSendMeUpdates() { return sendMeUpdates; }
    public MobileElement getDeviceNotification() { return deviceNotification; }
    public MobileElement getMenuButton() { return menuButton; }
    public MobileElement getTopStories() { return topStories; }
    public MobileElement getNews() { return news;}
    public MobileElement getPolitics() { return politics;}

    public void isNotificationDisplayed () { isElementVisible(notification);}
    public void isSendMeUpdatesDisplayed () { isElementVisible(sendMeUpdates);}
    public void isDeviceNotificationDisplayed () { isElementVisible(deviceNotification);}
    public void isMenuButtonDisplayed () {isElementVisible(menuButton);}
    public void isTopStoriesDisplayed () {isElementVisible(topStories);}
    public void isNewsDisplayed () {isElementVisible(news);}
    public void isPoliticsDisplayed () {isElementVisible(politics);}

    public void clickSendMeUpdates (){click(sendMeUpdates);}
    public void clickDeviceNotification () {click(deviceNotification);}
    public void clickMenu () {click(menuButton);}
    public void clickTopStories () {click(topStories);}
    public void clickNews () {click(news);}
    public void clickPolitics () {click(politics);}

    public void menuSelectList (String sectionName){

        for (MobileElement menu_option : menuList) {
            try {
                if (menu_option.getText().equals(sectionName)){
                    menu_option.click();
                }
            } catch (Exception e) {
                System.out.print("Cant find the" + sectionName + "menu on stream view");
            }
        }
    }

    //public void clickSection () {click(menuSelectList(String sectionName);}



}
