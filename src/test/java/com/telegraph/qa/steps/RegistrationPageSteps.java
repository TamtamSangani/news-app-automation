package com.telegraph.qa.steps;

import com.telegraph.qa.screens.RegistrationScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageSteps extends RegistrationScreen {

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

        isRegistrationPageDisplayed();
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
        isLineDisplayed();
    }

    @And("^should able to verify the static blue text 'Create your account for the telegraph'$")
    public void should_able_to_verify_the_static_blue_text_Create_your_account_for_the_telegraph() throws Throwable {

        isCereateAccountTextDisplayed();
    }

    @Then("^Should able to verify First name text box$")
    public void should_able_to_verify_First_name_text_box() throws Throwable {
        isFirstNameTextBoxDisplayed();
    }

    @Then("^able to verify Last name text box$")
    public void able_to_verify_Last_name_text_box() throws Throwable {
        isLastNameTextBoxDisplayed();
    }

    @Then("^Verify Your email text box$")
    public void verify_Your_email_text_box() throws Throwable {
        isEmailDisplayed();
    }

    @Then("^Verify Your password$")
    public void verify_Your_password() throws Throwable {
        isPasswordDisplayed();
        swipe(Direction.DOWN);
    }

    @Then("^Verify Don't miss out text$")
    public void verify_Don_t_miss_out_text() throws Throwable {
        isDontMissOutTextDisplayed(); isTelegraphMediaTextDisplayed();
    }

    @Then("^I verify marketing tick box with yes please! next to it$")
    public void i_verify_marketing_tick_box_with_yes_please_next_to_it() throws Throwable {
        isYesPleaseTextDisplayed();
    }

    @Then("^Verify Terms and Conditions link$")
    public void verify_Terms_and_Conditions_link() throws Throwable {
        isTermsAndConditionsLinkDisplayed();
    }

    @Then("^Verify Privacy Policy link$")
    public void verify_Privacy_Policy_link() throws Throwable {
        isPrivacyPolicyLinkDisplay();
    }

    @Then("^Verify Register button$")
    public void verify_Register_button() throws Throwable {
        isRegisterScreenButtonDisplayed();
    }

    @When("^I register with invalid first name$")
    public void i_register_with_invalid_first_name() throws Throwable {
        registerAs(getNumberName(), getValidLastName(), getValidEmailAddress(), getMinimumRequiredPassword());
    }

    @When("^I click on Register button on register screen$")
    public void i_click_on_Register_button_on_resgister_screen() throws Throwable {
        clickRegisterButtonOnRegisterScreen();
    }

    @Then("^Something Went wrong error message should be displayed$")
    public void something_Went_wrong_error_message_should_be_displayed() throws Throwable {
        errorMessageDisplayed();
    }

    @When("^I register with only one character in the last name$")
    public void i_register_with_only_one_character_in_the_last_namee() throws Throwable {
        registerAs(getValidFirstName(), getOneChar(), getValidEmailAddress(), getMinimumRequiredPassword());
    }

    @When("^I register with invalid email address$")
    public void I_register_with_invalid_email_address() throws Throwable {
        registerAs(getValidFirstName(), getValidLastName(), getInvalidEmailAddress(), getMinimumRequiredPassword());
    }

    @When("^enters less then required characters in the password field$")
    public void enters_less_then_required_characters_in_the_password_field() throws Throwable {
        registerAs(getValidFirstName(), getValidLastName(), getValidEmailAddress(), getSortPassword());
    }

    @When("^I enter valid register details$")
    public void I_enter_valid_register_details() throws Throwable {
        registerAs(getValidFirstName(), getValidLastName(), getValidEmailAddress(), getMinimumRequiredPassword());
    }

    @Given("^I see X button on the top corner of registration screen$")
    public void i_see_X_button_on_the_top_corner_of_registration_screen() throws Throwable {
        isRegistrationSkipButtonDisplayed();
    }
}
