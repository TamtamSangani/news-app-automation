package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends SharedDriver {

    private String invalidUsername = "invalidlogin@test.com";
    private String invalidPassword = "Invalid1234";

    @iOSXCUITFindBy(id = "Login")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_get_started_login")
    private MobileElement loginButton;

    @iOSXCUITFindBy(id = "Preprod")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/frame_onboarding_container")
    private MobileElement loginPageDisplayed;

    @iOSXCUITFindBy(id = "Close")
    @AndroidFindBy(id = "")
    private MobileElement loginskipButton;

    @iOSXCUITFindBy(id = "masthead")
    @AndroidFindBy(id = "")
    private MobileElement loginTitle;

    @iOSXCUITFindBy(id = "Login in to your Telegraph account")
    @AndroidFindBy(id = "")
    private MobileElement loginAccountText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Preprod\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(id = "")
    private MobileElement emailUsernameInput;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Preprod\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField")
    @AndroidFindBy(id = "com.clearscore.mobile.debug:id/fragment_login_password_input")
    private MobileElement passwordInput;

//    @iOSXCUITFindBy(id = "")
//    @AndroidFindBy(id = "")
//    private MobileElement PrintTSNumberInput;
//
//    @iOSXCUITFindBy(id = "PasswordInputTextField")
//    @AndroidFindBy(id = "com.clearscore.mobile.debug:id/fragment_login_password_input")
//    private MobileElement postcodeInput;

    public LoginScreen () { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getLoginButton() {return loginButton;}
    public MobileElement getLoginPageDisplayed() { return loginPageDisplayed;}
    public MobileElement getLoginskipButton() { return loginskipButton;}
    public MobileElement getLoginTitle() { return loginTitle;}
    public MobileElement getLoginAccountText() { return loginAccountText;}
    //public MobileElement getEmailUsernameInput() { return emailUsernameInput;}
    //public MobileElement getPasswordInput() { return passwordInput;}
   // public MobileElement getPrintTSNumberInput() { return PrintTSNumberInput;}
    //public MobileElement getPostcodeInput() { return postcodeInput;}


    public void isLoginButtonDisplayed () { isElementVisible(loginButton); }
    public void isLoginPageDisplayed () {isElementVisible(loginPageDisplayed);}
    public void isLoginSkipButtonDisplayed () {isElementVisible(loginskipButton);}
    public void isLoginTitleDisplayed () {isElementVisible(loginTitle);}
    public void isLoginTextDisplyayed () {isElementVisible(loginAccountText);}
//    public void isEmailAddressDisplayed() {isElementVisible(emailUsernameInput);}
//    public void isPasswordDisplayed() {isElementVisible(passwordInput);}
//    public void isTSNumberDisplayed() {isElementVisible(PrintTSNumberInput);}
//    public void isPostCodeDisplayed() {isElementVisible(postcodeInput);}
//    public String getInvalidUsername() {return invalidUsername;}
//    public String getInvalidPassword () {return invalidPassword;}
//
    public void clickLoginButton () { click(loginButton); }
    public void clickLoginSkipButton () { click(loginskipButton); }

    //    public void digitalLoginAs (String username, String password) {
//        sendKeys(username, emailUsernameInput);
//        closeKeyboard();
//        sendKeys(password, passwordInput);
//        closeKeyboard();
//        click(loginButton); /*Login Button name used to identify Login button on Login page*/
//    }
//
//        public void digitalLoginAs () {digitalLoginAs("","");}
//        public void enterEmail (String email) {sendKeys(email, emailUsernameInput);}
//        public void enterPassword (String password) {sendKeys(password, passwordInput);}

}
