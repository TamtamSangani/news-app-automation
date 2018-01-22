package com.telegraph.qa.steps;

import com.telegraph.qa.screens.MenuPageScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuPageSteps extends MenuPageScreen {

    @Then("^Should be displayed with Stay informed notification$")
    public void should_be_displayed_with_Stay_informed_notification() throws Throwable {

        isNotificationDisplayed();
    }

    @Then("^I select Send me updates to dismiss the notification$")
    public void i_select_Send_me_updates_to_dismiss_the_notification() throws Throwable {

        isSendMeUpdatesDisplayed(); clickSendMeUpdates();
    }

    @Then("^I dismiss the apple notification by tapping on Allow button$")
    public void i_dismiss_the_apple_notification_by_tapping_on_Allow_button() throws Throwable {

        isDeviceNotificationDisplayed (); clickDeviceNotification();
    }

    @Given("^I have selected the menu$")
    public void i_have_selected_the_menu() throws Throwable {

        isMenuButtonDisplayed(); clickMenu();
    }

    @When("^I choose the Top Stories section from the menu$")
    public void i_choose_the_Top_Stories_section_from_the_menu() throws Throwable {
        isTopStoriesDisplayed(); clickTopStories();
    }

    @Then("^I should be in the Top Stories section$")
    public void i_should_be_in_the_Top_Stories_section() throws Throwable {

        isTopStoriesDisplayed();
    }

    @When("^I choose the News section from the menu$")
    public void i_choose_the_News_section_from_the_menu() throws Throwable {
        isNewsDisplayed(); clickNews();
    }

    @Then("^I should be in the News section$")
    public void i_should_be_in_the_News_section() throws Throwable {
        isNewsDisplayed();
    }

    @When("^I choose the Politics section from the menu$")
    public void i_choose_the_Politics_section_from_the_menu() throws Throwable {

        isPoliticsDisplayed(); clickPolitics();
    }

    @Then("^I should be in the Politics section$")
    public void i_should_be_in_the_Politics_section() throws Throwable {

        isPoliticsDisplayed();
    }



}
