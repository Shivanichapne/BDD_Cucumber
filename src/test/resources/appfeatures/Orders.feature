Feature: Order information
Background:
Given User should be logged into the app
When User clicks on orders link
Then User redirects to the orders page

Scenario: Fetching currently placed order
When User clicks on currently placed order button
Then User should see current order information

Scenario: Fetching past orders information
When User clicks on past order button
Then User should see past order information

Scenario: Fetching cancelled orders information
When User clicks on cancelled order button
Then User should see cancelled order information