package com.telegraph.qa.steps;

import com.telegraph.qa.screens.RegistrationScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageSteps extends RegistrationScreen{

    @Given("^I see Register button on the bottom left$")
    public void i_see_Register_button_on_the_bottom_left() throws Throwable {

        isRegisterButtonDisplayed ();
    }

    @When("^I click on Register button$")
    public void i_click_on_Register_button() throws Throwable {

        clickRegisterButton();
    }

    @Then("^I should be taken to Registration page\\.$")
    public void i_should_be_taken_to_Registration_page() throws Throwable {

        //isRegistrationPageDisplayed();
    }

    @Given("^user is on Registration page$")
    public void user_is_on_Registration_page() throws Throwable {
        isRegistrationPageDisplayed();
    }

    @And("^should able to verify the Static Title 'The Telegraph' ont the page$")
    public void should_able_to_verify_the_Static_Title_The_Telegraph_ont_the_page() throws Throwable {
        isStaticTitleDisplayed();
    }

    @And("^should able to verify the line under the Static Title$")
    public void should_able_to_verify_the_line_under_the_Static_Title() throws Throwable {

    }

    @And("^should able to verify the static blue text 'Create your account for the telegraph'$")
    public void should_able_to_verify_the_static_blue_text_Create_your_account_for_the_telegraph() throws Throwable {

        isCereateAccountTextDisplayed();
    }
}
