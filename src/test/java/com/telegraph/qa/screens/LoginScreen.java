package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends SharedDriver {

    private String validUsername = "Tamtam.Sangani@gmail.com";
    private String validPassword = "A1efc001abc";
    private String invalidUsername = "invalidlogin@test.com";
    private String invalidPassword = "Invalid1234";
    private String invalidLoginMessage = "Log in failed Sorry, we cannot find an account with this email address and password combination. please try again or reset your password.";

    @iOSXCUITFindBy(id = "Login")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_get_started_login")
    private MobileElement loginButton;

    @iOSXCUITFindBy(id = "masthead")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/frame_onboarding_container")
    private MobileElement loginPageDisplayed;

    @iOSXCUITFindBy(id = "Close")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_get_started_login")
    private MobileElement loginskipButton;

    @iOSXCUITFindBy(id = "masthead")
    @AndroidFindBy(id = "")
    private MobileElement loginTitle;

    @iOSXCUITFindBy(id = "Login in to your Telegraph account")
    @AndroidFindBy(id = "")
    private MobileElement loginAccountText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Preprod\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(id = "")
    private MobileElement usernameInput;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Preprod\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField")
    @AndroidFindBy(id = "com.clearscore.mobile.debug:id/fragment_login_password_input")
    private MobileElement passwordInput;

    @iOSXCUITFindBy(id = "I've forgotten my password")
    @AndroidFindBy(id = "")
    private MobileElement forgottenPassowrd;

    @iOSXCUITFindBy(id = "Log in")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_get_started_login")
    private  MobileElement loginScreenLoginButton;

    @iOSXCUITFindBy(id = "//XCUIElementTypeAlert[@name=\"Log in failed\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2")
    @AndroidFindBy(id = "")
    private MobileElement notificationWarningMessage;

//    @iOSXCUITFindBy(id = "")
//    @AndroidFindBy(id = "")
//    private MobileElement PrintTSNumberInput;

//    @iOSXCUITFindBy(id = "")
//    @AndroidFindBy(id = "")
//    private MobileElement postcodeInput;

    public LoginScreen () { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getLoginButton() {return loginButton;}
    public MobileElement getLoginPageDisplayed() { return loginPageDisplayed;}
    public MobileElement getLoginskipButton() { return loginskipButton;}
    public MobileElement getLoginTitle() { return loginTitle;}
    public MobileElement getLoginAccountText() { return loginAccountText;}
    public MobileElement getForgottenPassowrd() { return forgottenPassowrd;}
    public MobileElement getLoginScreenLoginButton () {return loginScreenLoginButton; }
    public MobileElement getUsernameInput() { return usernameInput;}
    public MobileElement getPasswordInput() {return passwordInput;}
    public String getInvalidUsername() {return invalidUsername;}
    public String getInvalidPassword() {return invalidPassword;}
    public String getValidUsername() {return validUsername;}
    public String getValidPassword() {return validPassword;}


    public void isLoginButtonDisplayed () { isElementVisible(loginButton); }
    public void isLoginPageDisplayed () {isElementVisible(loginPageDisplayed);}
    public void isLoginSkipButtonDisplayed () {isElementVisible(loginskipButton);}
    public void isLoginTitleDisplayed () {isElementVisible(loginTitle);}
    public void isLoginTextDisplyayed () {
        isElementVisible(loginAccountText);
        swipeUntilElementDisplayed(forgottenPassowrd, Direction.DOWN);
        closeKeyboard();
    }
    public void isFogottenPasswordDisplayed () { isElementVisible(forgottenPassowrd);}
    public void isLoginScreenLoginButtonDisplayed () {isElementVisible(loginScreenLoginButton);}


    public void clickLoginButton () { click(loginButton); }
    public void clickLoginSkipButton () { click(loginskipButton); }
    public void loginAs (String username, String password){
        clear(usernameInput);
        sendKeys(username,usernameInput);
        closeKeyboard();
        sendKeys(password, passwordInput);
        closeKeyboard();
        click(loginScreenLoginButton);

    }

    public void clickLoginScreenLoginButton() { click(loginScreenLoginButton);}

    public void loginAs () {loginAs ("","");}
    public void enterEmail (String email) {sendKeys(email, usernameInput);}
    public void enterPassword (String password) {sendKeys(password, passwordInput);}
    public void notificationErrorMessageIsDisplayed () {isCorrectMessageDisplayed(notificationWarningMessage, invalidLoginMessage);}

}
