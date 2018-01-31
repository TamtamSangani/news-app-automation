Feature: Menu

  Scenario: From Menu screen selecting send me notification
    Given I see the Landing page
    When I click on X button
    Then I should be taken to Menu page
    And Should be displayed with Stay informed notification
    And I select Send me updates to dismiss the notification
    And I dismiss the apple notification by tapping on Allow button
    Then I click on X button

  Scenario Outline: Selecting a section on the menu takes me to that section
    Given I have selected the menu
    When I choose the <section_type> section from the menu
    Then I should be in the <section_type> section
    Examples:
     |section_type          |
     |Top Stories           |
     |News                  |
     |Politics              |
#     |Sport                 |
#     |Business              |
#     |Money                 |
#     |Technology            |
#     |In caseyou missed it  |
#     |Opinon                |
#     |Video                 |
#     |Culture               |
#     |Travel                |
#     |LifeStyle             |
#     |Christmas             |
#     |Premium               |

#  Scenario: I can close the menu from the stream
#    Given I am on the stream view
#    When I open the menu
#    And I close the menu
#    Then I see the articles
#
#  Scenario: Menu automatically shows on first use
#    Given I proceed past the splash screen
#    When I proceed past the signup screen
#    Then I should see the menu
#
#  Scenario: Menu doesn't show after first use
#    Given I close and open the app
#    Then I am on the stream view
#
#  Scenario Outline: Sections can be edited in menu.
#    Given I edit and save the menu sections <sections> without closing
#    Then I <state> see the sections <sections>
#    Examples:
#      | sections                          | state  |
#      | Football,Cricket,Culture,Travel   | can    |
#      | News,Sport,Business,Comment       | cannot |
#
#  Scenario: Editing menu does not save on cancel
#    Given I edit and cancel the menu sections Football,Cricket,Culture,Travel with closing
#    Then I cannot see the sections Football,Cricket,Culture,Travel
