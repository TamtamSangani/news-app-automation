Feature: Landing Page of On-Boarding

Scenario: User is taken to landing page of on boarding when launched from New Install
Given I see the Landing page
And I see Register button on the bottom left
And I see Log in Button on the bottom right
And I see X button on the top corner
And I see The fastest, easiest way to get the news that matters to you text on the screen .

Scenario: Selecting the 'X' (Skip) Button should take user's to the Menu screen
Given I see the Landing page
When I click on X button
Then I should be taken to menu page

Scenario: The app should not display this screen if the user has 'Skipped' before
Given I have launched the app
When I see the Landing page
And I click on X button to skip to edit menu
And I Kill the app from back ground
And I relaunch the app
Then I should be taken to Menu page