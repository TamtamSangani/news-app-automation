package com.telegraph.qa.steps;

import com.telegraph.qa.screens.MenuScreen;
import cucumber.api.java.en.Then;

public class MenuSteps extends MenuScreen{

    @Then("^Should be displayed with Stay informed notification$")
    public void should_be_displayed_with_Stay_informed_notification() throws Throwable {

        isNotificationDisplayed();
    }

    @Then("^I select Send me updates to dismiss the notification$")
    public void i_select_Send_me_updates_to_dismiss_the_notification() throws Throwable {

        isNotificationDisplayed(); clickSendMeUpdates();
    }

    @Then("^I dismiss the apple notification by tapping on Allow button$")
    public void i_dismiss_the_apple_notification_by_tapping_on_Allow_button() throws Throwable {

        clickDeviceNotification();
    }

    @Then("^I swipe up$")
    public void i_swipe_up() throws Throwable {
        swipeDownPage();
    }

}
