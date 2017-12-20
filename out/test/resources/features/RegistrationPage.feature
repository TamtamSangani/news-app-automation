Feature: New On-Boarding Registration page

  Scenario: Selecting the 'Register' Button takes user to the create an account page
    Given I see the Landing page
    When I click on Register button
    Then I should be taken to Registration page.

  Scenario: Verify Static title is displayed of The Telegraph
    #Given user is on Registration page
    And should able to verify the Static Title 'The Telegraph' ont the page
    And should able to verify the line under the Static Title
    And should able to verify the static blue text 'Create your account for the telegraph'
    And I see X button on the top corner