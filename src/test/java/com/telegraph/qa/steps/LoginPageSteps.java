package com.telegraph.qa.steps;

import com.telegraph.qa.screens.LoginScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends LoginScreen{

    @Given("^I see Log in Button on the bottom right$")
    public void i_see_Log_in_Button_on_the_bottom_right() throws Throwable {

        isLoginButtonDisplayed();
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

    @Given("^I click on skip button$")
    public void i_click_on_skip_button() throws Throwable {
        clickLoginSkipButton();
    }

    @When("^I login with invalid login details$")
    public void i_login_with_invalid_login_details() throws Throwable {
        //digitalLoginAs(getInvalidUsername(), getInvalidPassword());
    }

    @Then("^Error message is displayed$")
    public void error_message_is_displayed() throws Throwable {

    }

}
