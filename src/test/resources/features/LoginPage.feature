Feature: New Onboarding Login page

  Scenario: Selecting the login button takes users to the current Login page
    Given I see the Landing page
    When I click on Log in Button
    And I see the skip button on the top corner
    And I see the title
    And I see the 'Login in to your Telegraph account' text

  Scenario: Selecting the 'X' button takes user back to Landing page
    Given I click on skip button
    Then I see the Landing page

  Scenario: As a user I want to be warned when I login with invalid details
    Given I click on Log in Button
    When I login with invalid login details
    Then Error message is displayed

    #Then I should be taken to Log in Page

