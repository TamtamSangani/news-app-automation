package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationScreen extends SharedDriver {

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Register\"])[1]")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_get_started_register")
    private MobileElement registerButton;

    @iOSXCUITFindBy(id = "Preprod")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/frame_onboarding_container")
    private MobileElement registrationPage;

    @iOSXCUITFindBy(id = "(//XCUIElementTypeImage[@name=\"Onboarding/masthead\"])[2]")
    @AndroidFindBy(id = "")
    private MobileElement staticTitle;

    @iOSXCUITFindBy(id = "skip")
    @AndroidFindBy(id = "")
    private MobileElement registrationSkip;

    @iOSXCUITFindBy(id = "Create your account for The Telegraph")
    @AndroidFindBy(id = "")
    private MobileElement createAccountText;

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "")
    private MobileElement example;

    public RegistrationScreen () { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getRegisterButton() {return registerButton;}
    public MobileElement getRegistrationPage() {return registrationPage;}
    public MobileElement getStaticTitle() {return staticTitle;}
    public MobileElement getCreateAccountText() {return createAccountText; }

    public void isRegisterButtonDisplayed () { isElementVisible(registerButton); }
    public void isRegistrationPageDisplayed () {isElementVisible(registrationPage);}
    public void isStaticTitleDisplayed () {isElementVisible(staticTitle);}
    public void isCereateAccountTextDisplayed () {isElementVisible(createAccountText);}

    public void clickRegisterButton () {click(registerButton);}
}
