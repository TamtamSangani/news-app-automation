Feature: New On-boarding Login page

  Scenario: Selecting the login button takes users to the current Login page
    Given I see the Landing page
    When I click on Log in Button
    And I see the skip button on the top corner
    And I see the title
    And I see the 'Login in to your Telegraph account' text
    And I see I've forgotten my password link
    And Log in button is inactive state

  Scenario: Selecting the 'X' button takes user back to Landing page
    Given I click on skip button
    Then I see the Landing page

  Scenario: As a user I want to be warned when I login with invalid details
    Given I click on Log in Button
    When I login with invalid login details
    Then Notification error message should be displayed

#  Scenario: As a user I want to be warned when I login with invalid details
#    Given I click on Log in Button
#    When I enter invalid print subscriber username
#    And I enter valid password
#    Then Error message is displayed 'Log in Failed Sorry, we cannot find an account with this email address and password combination. Please try again or reset your password.'
#
#  Scenario: As a user I want to be warned when I login with invalid details
#    Given I click on Log in Button
#    When I enter valid print subscriber username
#    And I enter valid password
#    Then Error message is displayed 'Log in Failed Sorry, we cannot find an account with this email address and password combination. Please try again or reset your password.'
#
  Scenario: As a user I want to be given access to article when I enter valid details
    Given I click on Log in Button
    When I login with valid login details
    Then I should be taken to Menu page

