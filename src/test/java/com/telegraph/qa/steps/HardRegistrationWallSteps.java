package com.telegraph.qa.steps;

import com.telegraph.qa.screens.HardRegistrationWallScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HardRegistrationWallSteps extends HardRegistrationWallScreen{

    @When("^I select an Political article$")
    public void i_select_an_Political_article() throws Throwable {

        clickPoliticalArticle();
    }


    @Then("^I should be displayed with Registration wall$")
    public void i_should_be_displayed_with_Registration_wall() throws Throwable {

        isRegistrationWallTextDisplayed();
    }

    @Then("^Should be displayed with Message 'Register or log in to view this and other Politics article\\. it's free and easy to do'$")
    public void should_be_displayed_with_Message_Register_or_log_in_to_view_this_and_other_Politics_article_it_s_free_and_easy_to_do() throws Throwable {
        isRegistrationWallTextDisplayed();
    }

    @Then("^I select non premium article$")
    public void i_select_non_premium_article() throws Throwable {
        swipe(Direction.DOWN); clickPoliticalArticle();
    }



    @When("^I click on Political article$")
    public void i_click_on_Political_article() throws Throwable {

    }

    @Then("^Full article is displayed$")
    public void full_article_is_displayed() throws Throwable {

    }

    @Given("^I select the premium Political article$")
    public void i_select_the_premium_Political_article() throws Throwable {

    }

    @Given("^I select premium article$")
    public void i_select_premium_article() throws Throwable {

    }

    @Given("^I swipe down to bottom of the screen$")
    public void i_swipe_down_to_bottom_of_the_screen() throws Throwable {
        registrationSwipeDown();
    }

    @Then("^I should be displayed with premium wall$")
    public void i_should_be_displayed_with_premium_wall() throws Throwable {

    }

    @Given("^I navigate back to stream view$")
    public void i_navigate_back_to_stream_view() throws Throwable {
        clickBackButton();
    }

    @Then("^I should be taken back to article$")
    public void i_should_be_taken_back_to_article() throws Throwable {
        isPoliticalArticleDisplayed();
    }


}
