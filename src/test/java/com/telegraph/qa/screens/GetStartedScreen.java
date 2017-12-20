package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedScreen extends SharedDriver{

    @iOSXCUITFindBy(id = "Onboarding/welcome_bg")
    @AndroidFindBy(id = "Hoping to complete the regression today")
    private MobileElement onBoardingScreen;

    @iOSXCUITFindBy(id = "Get started")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_get_started")
    private MobileElement startButton;

//    @iOSXCUITFindBy(id = "")
//    @AndroidFindBy (id = "")
//    private MobileElement RegistrationPage;

    public GetStartedScreen() { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getOnBoardingScreen() {return onBoardingScreen;}
    public MobileElement getStartButton () {return startButton;}
    //public MobileElement getRegistrationPage () {return RegistrationPage;}

    public void isOnBoardingDisplyed () {
        isElementVisible(onBoardingScreen);
    }

    public void isGetStartedButton () { click(startButton);}

    //public void isRegistrationPage () {isElementVisible(RegistrationPage);}

}
