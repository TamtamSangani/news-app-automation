package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class HardRegistrationWallScreen extends SharedDriver {

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"smallCardHeader\"])[2]")
    @AndroidFindBy(id = "")
    private MobileElement PoliticalArticle;

    @iOSXCUITFindBy(id = "Register or log in to view this and other Politics articles. It’s free and easy to do.")
    @AndroidFindBy(id = "")
    private MobileElement RegistrationWallText;

    @iOSXCUITFindBy(id = "Back")
    @AndroidFindBy(id = "")
    private MobileElement backButton;

    @iOSXCUITFindBy(id = "articleHeadline")
    @AndroidFindBy(id = "")
    private MobileElement articleHeadline;

    public HardRegistrationWallScreen () {
        PageFactory.initElements (new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getPoliticalArticle() { return PoliticalArticle; }
    public MobileElement getRegistrationWallText() { return RegistrationWallText; }
    public MobileElement getBackButton() { return backButton; }
    public MobileElement getArticleHeadline() { return articleHeadline; }

    public void isPoliticalArticleDisplayed () {isElementDisplayed(PoliticalArticle);}
    public void isRegistrationWallTextDisplayed () {

        swipe(Direction.DOWN);
        isElementDisplayed(RegistrationWallText);}
    public void isBackButtonDisplayed () {isElementDisplayed(backButton);}
    public void isArticleHeqadlineDisplayed () {isElementDisplayed(articleHeadline);}

    public void clickPoliticalArticle () {
        click(PoliticalArticle);
        swipe(Direction.DOWN);
        swipe(Direction.DOWN);


    }
    public void clickBackButton () {click(backButton);}

    public void registrationSwipeDown () {swipeElement(RegistrationWallText, articleHeadline);}
}
