Feature: New On-Boarding Registration page

  Scenario: Selecting the 'Register' Button takes user to the create an account page
    Given I see the Landing page
    When I click on Register button
    Then I should be taken to Registration page.

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

#  Scenario: Error message is displayed when duplicate email is entered
#    Given user is on Registration page
#    When Enters full First name
#    And Enter full Last name
#    And enter already registered email address
#    And enters password longer then eight character
#    And Registration Button is active
#    When I click on Register button
#    Then error message should be displayed
#    And I dismiss the error message
#    Then I should be taken to Menu page

  Scenario: User is given an access with valid credentials
    Given user is on Registration page
    When I enter valid register details
    And I click on Register button on register screen
    Then I should be taken to Menu page
