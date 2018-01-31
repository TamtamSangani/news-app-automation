package com.telegraph.qa.steps;

import com.telegraph.qa.screens.LoginScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends LoginScreen{

    @Given("^I see Log in Button on the bottom right$")
    public void i_see_Log_in_Button_on_the_bottom_right() throws Throwable {

        isLoginScreenLoginButtonDisplayed();
    }

    @When("^I click on Log in Button$")
    public void i_click_on_Log_in_Button() throws Throwable {

        clickLoginButton();
    }

    @Then("^I should be taken to Log in Page$")
    public void i_should_be_taken_to_Log_in_Page() throws Throwable {

        isLoginPageDisplayed();
    }

    @When("^I see the skip button on the top corner$")
    public void i_see_the_skip_button_on_the_top_corner() throws Throwable {

        isLoginSkipButtonDisplayed();
    }

    @When("^I see the title$")
    public void i_see_the_title() throws Throwable {
        isLoginTitleDisplayed();
    }

    @When("^I see the 'Login in to your Telegraph account' text$")
    public void i_see_the_Login_in_to_your_Telegraph_account_text() throws Throwable {
        isLoginTextDisplyayed();
    }


    @When("^I see I've forgotten my password link$")
    public void i_see_I_ve_forgotten_my_password_link() throws Throwable {
        isFogottenPasswordDisplayed();
    }

    @When("^Log in button is inactive state$")
    public void log_in_button_is_inactive_state() throws Throwable {
        isLoginScreenLoginButtonDisplayed();
    }

    @Given("^I click on skip button$")
    public void i_click_on_skip_button() throws Throwable {
        clickLoginSkipButton();
    }

    @When("^I login with invalid login details$")
    public void iLoginWithInvalidLoginDetails(){
        loginAs(getInvalidUsername(), getInvalidPassword());
    }

    @Then("^Notification error message should be displayed$")
    public void notification_error_message_should_be_displayed() throws Throwable {
        notificationErrorMessageIsDisplayed();
    }

    @When("^I login with valid login details$")
    public void i_login_with_valid_login_details() throws Throwable {
        loginAs(getValidUsername(), getValidPassword());
    }
    @Given("^I click on Login Button$")
    public void I_click_on_Login_Button() throws Throwable {
        clickLoginScreenLoginButton();
    }
}
