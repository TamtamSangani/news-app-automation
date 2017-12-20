package com.telegraph.qa.steps;

import com.telegraph.qa.screens.GetStartedScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetStartedSteps extends GetStartedScreen {


    @Given("^user is on landing page of the on-boarding$")
    public void user_is_on_landing_page_of_the_on_boarding()  {

        isOnBoardingDisplyed();
    }

    @When("^user clicks on Get Started button$")
    public void user_clicks_on_Get_Started_button()  {
        isGetStartedButton();
    }

    @Then("^user is taken to Registration page$")
    public void user_is_taken_to_Registration_page() {

        //isRegistrationPage(); // Need to add elements fot this
    }
}
