package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;

public class RegistrationScreen extends SharedDriver {

    private String numberName = "1";
    private String oneChar = "a";
    private String validFirstName = "Bill";
    private String validLastName = "Gates";
    private String invalidEmailAddress = "Test1001.test.com";
    private String validEmailAddress = "Test1001@test.com";
    private String sortPassword = "test";
    private String minimumRequiredPassword = "Test1234";
    private String specialCharater = "!@£$%^&&^&*";
    private String somethingWentWrong = "Something went worng Sorry there was a problem signing you up. please try again later";


    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Register\"])[1]")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_get_started_register")
    private MobileElement registerButton;

    @iOSXCUITFindBy(id = "Preprod")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/frame_onboarding_container")
    private MobileElement registrationPage;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"Onboarding/masthead\"])[2]")
    @AndroidFindBy(id = "")
    private MobileElement staticTitle;

    @iOSXCUITFindBy(id = "skip")
    @AndroidFindBy(id = "")
    private MobileElement registrationSkip;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Preprod\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    @AndroidFindBy(id = "")
    private MobileElement line;

    @iOSXCUITFindBy(id = "Create your account for The Telegraph")
    @AndroidFindBy(id = "")
    private MobileElement createAccountText;

    @iOSXCUITFindBy(id = "firstName")
    @AndroidFindBy(id = "")
    private MobileElement firstNameInput;

    @iOSXCUITFindBy(id = "lastName")
    @AndroidFindBy(id = "")
    private MobileElement lastNameInput;

    @iOSXCUITFindBy(id = "email")
    @AndroidFindBy(id = "")
    private MobileElement emailInput;

    @iOSXCUITFindBy(id = "password")
    @AndroidFindBy(id = "")
    private MobileElement passwordInputField;

    @iOSXCUITFindBy(id = "Don’t miss out")
    @AndroidFindBy(id = "")
    private MobileElement dontMissOutText;

    @iOSXCUITFindBy(id = "Telegraph Media Group Limited and its group companies would like to keep you informed about other offers, promotions and services that might interest you by email. Let us know if you would like to hear from us by ticking the box.")
    @AndroidFindBy(id = "")
    private MobileElement telegrpagMediaText;

    @iOSXCUITFindBy(id = "Yes please!")
    @AndroidFindBy(id = "")
    private MobileElement yesPlease;

    @iOSXCUITFindBy(id = "Terms and Conditions")
    @AndroidFindBy(id = "")
    private MobileElement termsAndConditions;

    @iOSXCUITFindBy(id = "Privacy Policy")
    @AndroidFindBy(id = "")
    private MobileElement privacyPolicy;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Register\"])[2]")
    @AndroidFindBy(id = "")
    private MobileElement registerScreenButton;

    @iOSXCUITFindBy(xpath = "ication[@name=\"Preprod\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther")
    @AndroidFindBy(id = "")
    private MobileElement somethingWentWrongPopUp;

    @iOSXCUITFindBy(xpath = "Something went wrong")
    @AndroidFindBy(id = "")
    private MobileElement somethingWentWrongTitle;

    @iOSXCUITFindBy(xpath = "Sorry there was a problem signing you up. Please try again later")
    @AndroidFindBy(id = "")
    private MobileElement somethingWentWrongMessage;

    @iOSXCUITFindBy(id = "OK")
    @AndroidFindBy(id = "")
    private MobileElement popUpOkButton;

    @iOSXCUITFindBy(id = "skip")
    @AndroidFindBy(id = "")
    private MobileElement registrationSkipButton;

//    @iOSXCUITFindBy(id = "")
//    @AndroidFindBy(id = "")
//    private MobileElement example;

    public RegistrationScreen () { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getRegisterButton() {return registerButton;}
    public MobileElement getRegistrationPage() {return registrationPage;}
    public MobileElement getStaticTitle() {return staticTitle;}
    public MobileElement getLine() {return line; }
    public MobileElement getCreateAccountText() {return createAccountText; }
    public MobileElement getFirstName () {return firstNameInput; }
    public MobileElement getLastName () {return lastNameInput; }
    public MobileElement getEmail() { return emailInput; }
    public MobileElement getPassword() { return passwordInputField; }
    public MobileElement getDontMissOutText() { return dontMissOutText; }
    public MobileElement getTelegrpagMediaText() { return telegrpagMediaText; }
    public MobileElement getYesPlease() { return yesPlease; }
    public MobileElement getTermsAndConditions() { return termsAndConditions; }
    public MobileElement getPrivacyPolicy() { return privacyPolicy; }
    public MobileElement getRegisterScreenButton() { return registerScreenButton; }
    public String getNumberName() { return numberName; }
    public String getOneChar() { return oneChar; }
    public String getValidFirstName() { return validFirstName; }
    public String getValidLastName() { return validLastName; }
    public String getInvalidEmailAddress() { return invalidEmailAddress; }
    public String getValidEmailAddress() { return validEmailAddress; }
    public String getSortPassword() { return sortPassword; }
    public String getMinimumRequiredPassword() { return minimumRequiredPassword; }
    public String getSpecialCharater() { return specialCharater; }
    public MobileElement getSomethingWentWrongPopUp () {return somethingWentWrongPopUp;}
    public MobileElement getSomethingWentWrongTitle() { return somethingWentWrongTitle; }
    public MobileElement getSomethingWentWrongMessage() { return somethingWentWrongMessage; }
    public MobileElement getPopUpOkButton() { return popUpOkButton; }
    public MobileElement getRegistrationSkipButton() { return registrationSkipButton; }

    public void isRegisterButtonDisplayed () { isElementVisible(registerButton); }
    public void isRegistrationPageDisplayed () {isElementVisible(registrationPage);}
    public void isStaticTitleDisplayed () {isElementVisible(staticTitle);}
    public void isLineDisplayed () {isElementVisible(line);}
    public void isCereateAccountTextDisplayed () {isElementVisible(createAccountText);}
    public void isFirstNameTextBoxDisplayed () {isElementVisible(firstNameInput);}
    public void isLastNameTextBoxDisplayed() {isElementVisible(lastNameInput);}
    public void isEmailDisplayed() {isElementVisible(emailInput);}
    public void isPasswordDisplayed() {isElementVisible(passwordInputField);}
    public void isDontMissOutTextDisplayed() {isElementVisible(dontMissOutText);}
    public void isTelegraphMediaTextDisplayed() {isElementVisible(telegrpagMediaText);}
    public void isYesPleaseTextDisplayed() {isElementVisible(yesPlease);}
    public void isTermsAndConditionsLinkDisplayed() {isElementVisible(termsAndConditions);}
    public void isPrivacyPolicyLinkDisplay() {isElementVisible(privacyPolicy);}
    public void isRegisterScreenButtonDisplayed() {isElementVisible(registerScreenButton);}
    public void isRegistrationSkipButtonDisplayed () {isElementVisible(registrationSkipButton);}


    public void clickRegisterButton () {click(registerButton);}
    public void clickRegisterButtonOnRegisterScreen () {click(registerScreenButton);}

    public void registerAs (String firstName, String lastName, String emailAddress, String passwords){
        clear(firstNameInput);
        sendKeys(firstName, firstNameInput);
        closeKeyboard();
        clear(lastNameInput);
        sendKeys(lastName, lastNameInput);
        closeKeyboard();
        swipe(Direction.DOWN);
        clear(emailInput);
        sendKeys(emailAddress, emailInput);
        closeKeyboard();
        clear(passwordInputField);
        sendKeys(passwords, passwordInputField);
        closeKeyboard();

    }

    public void registerAs () {registerAs ("","","","");}
    public void enterFirstName (String first) {sendKeys(first, firstNameInput);}
    public void enterLastName (String last) {sendKeys(last, lastNameInput);}
    public void enterEmail (String emailAddress) {sendKeys(emailAddress, emailInput);}
    public void enterPasswordField (String password) {sendKeys(password, passwordInputField);}
    public void errorMessageDisplayed () {isCorrectMessageDisplayed(somethingWentWrongPopUp, somethingWentWrong);}

}
