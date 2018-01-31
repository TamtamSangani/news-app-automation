package com.telegraph.qa.steps;

import com.telegraph.qa.screens.LandingScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingPageSteps extends LandingScreen{

    @Given("^I see the Landing page$")
    public void i_see_the_Landing_page() throws Throwable {

        isWelcomeScreenDisplayed();
    }

    @Given("^I see X button on the top corner$")
    public void i_see_X_button_on_the_top_corner() throws Throwable {

        isSkipButtonDisplayed();
    }

    @Given("^I see The fastest, easiest way to get the news that matters to you text on the screen \\.$")
    public void i_see_The_fastest_easiest_way_to_get_the_news_that_matters_to_you_text_on_the_screen() throws Throwable {

        isWelcomeTextDisplayed();
    }

    @Given("^I am on Landing page$")
    public void i_am_on_Landing_page() throws Throwable {

        clickSkipButton();
    }

    @When("^I click on X button$")
    public void i_click_on_X_button() throws Throwable {

        clickSkipButton();
    }

    @Then("^I should be taken to Menu page$")
    public void i_should_be_taken_to_Menu_page() throws Throwable {
        isMenuScreenDisplayed();
    }

    @When("^I click on X button to skip to edit menu$")
    public void i_click_on_X_button_to_skip_to_edit_menu() throws Throwable {
        clickSkipButton();
    }

    @When("^I Kill the app from back ground$")
    public void i_Kill_the_app_from_back_ground() throws Throwable {

    }

    @When("^I relaunch the app$")
    public void i_relaunch_the_app() throws Throwable {

    }


    @Given("^I am on the stream view$")
    public void i_am_on_the_stream_view() throws Throwable {
        clickSkipButton();
        swipe(Direction.DOWN);
    }


}
