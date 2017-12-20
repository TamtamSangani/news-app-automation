Feature: Menu

  Scenario: From Menu screen selecting send me notification
    Given I see the Landing page
    When I click on X button
    Then I should be taken to Menu page
    And Should be displayed with Stay informed notification
    And I select Send me updates to dismiss the notification
    And I dismiss the apple notification by tapping on Allow button
    And I swipe up
