Feature: On-Boarding screen

  @test
  Scenario: Verify Registration page is accessibleby selecting 'Get Started' from the on-boarding landing page.
    Given user is on landing page of the on-boarding
    When user clicks on Get Started button
    # Then user is taken to Registration page

#  Scenario: Selecting the 'Register' Button takes user to the create an account page
#    Given I am on Landing page
#    When I click on Register button
#    Then I should be taken to Registration page.
#
#  Scenario: Selecting the login button takes users to the current Login page
#    Given I am On the Landing page
#    When I click on Log in Button
#    Then I should be taken to Log in Page
#
#  Scenario: The app should not display this screen if the user has 'Skipped' before
#    Given I have launched the app
#    When I see the Landing page
#    And I click on X button to skip to edit menu
#    And I Kill the app from back ground
#    And I relaunch the app
#    Then I should be taken to Menu page