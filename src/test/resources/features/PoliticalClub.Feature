Feature: Hard Registration Wall

  Scenario: User not logged in or Registered will be displayed with Registration wall for non premium political article
    Given I see the Landing page
    When I click on X button
    And I select Send me updates to dismiss the notification
    And I dismiss the apple notification by tapping on Allow button
    Given I am on the stream view
    When I select an Political article
    Then I should be displayed with Registration wall
    And Should be displayed with Message 'Register or log in to view this and other Politics article. it's free and easy to do'
    And I see Register button on the bottom left
    And I see Log in Button on the bottom right

  Scenario: Tapping on Login button will take user to Login screen
    Given I click on Login Button
    Then I should be taken to Log in Page

  Scenario: Clicking on X (Skip) button from Log in page will take user back to article
    Then I click on X button
    And I should be taken back to article

  Scenario: Tapping on Registration button will take user to Registration page
    Given I click on Register button
    Then user is taken to Registration page

  Scenario: Verify Static title is displayed of The Telegraph
    Given should able to verify the Static Title 'The Telegraph' ont the page
    And should able to verify the line under the Static Title
    And should able to verify the static blue text 'Create your account for the telegraph'
    And I see X button on the top corner of registration screen
    Then Should able to verify First name text box
    And able to verify Last name text box
    And Verify Your email text box
    And Verify Your password
    And Verify Don't miss out text
    And I verify marketing tick box with yes please! next to it
    And Verify Terms and Conditions link
    And Verify Privacy Policy link
    Then Verify Register button

  Scenario: Error message is displayed when entering a number as first name
    When I register with invalid first name
    And I click on Register button on register screen
    Then Something Went wrong error message should be displayed

  Scenario: Error message is displayed when entering only one character in the last name text box
    Given user is on Registration page
    When I register with only one character in the last name
    And I click on Register button on register screen
    Then Something Went wrong error message should be displayed

  Scenario: Invalid email will displayed and error message under the box
    Given user is on Registration page
    When I register with invalid email address
    Then Error is displayed under the email text box

  Scenario: if less then eight characters in the password then register button will not be active
    Given user is on Registration page
    When enters less then required characters in the password field
    Then Register button should not be active

  Scenario: Clicking on X (Skip) button from Registration will take user back to article
    And I see X button on the top corner of registration screen
    Then I should be taken back to article

#  Scenario: Once the user has registered then full article will be displayed fully
#    Given I have selected the menu
#    When I choose the Politics section from the menu
#    Then I should be in the Politics section
#    And I select non premium article
#    And I swipe down to bottom of the screen
#    Then I click on Register button
#    And user is taken to Registration page
#    And User signs up with valid credentials

#  Scenario: User with premium logged in will not be displayed with Registration wall
#    Given I have already logged in to the app
#    When I click on Political article
#    Then Full article is displayed
#
#  Scenario: No Registration wall is displayed for premium article (need to write the steps once mock server is up and running)
#    Given I navigate back to stream view
#    When I select the premium Political article
#    And I select premium article
#    And I swipe down to bottom of the screen
#    Then I should be displayed with premium wall

#  Scenario: Tapping on Registration button will take user to Registration page
#    Given I navigate back to stream view
#    And I select an Political article
#    And I swipe down to bottom of the screen
#    Then I click on Register button
#    And user is taken to Registration page

#
#  Scenario: Pay wall will be displayed after two paragraph
#    Given I choose the Politics section from the menu
#    And I select premium article
#    And I swipe down to paragraph
#    Then I should be displayed with
#


#  Scenario: Once the user has registered then full article will be displayed fully
#    Given I have selected the menu
#    When I choose the Politics section from the menu
#    Then I should be in the Politics section
#    And I select non premium article
#    And I swipe down to bottom of the screen
#    Then I click on Register button
#    And user is taken to Registration page
#    And User signs up with valid credentials
#
##  Scenario: No Outbrain ads are displayed after registration wall
##
##  Scenario: Outbrain ads will be displayed once full article is displayed