Feature: Home page functionality

Scenario: verify title of page
Given user is at the landing page
Then page title should contains "Shopping"

Scenario: verify cart icon
Given user is at the landing page
Then cart icon should get display

Scenario: checkout deals section
Given user is at the landing page
When user clicks on fashion link
Then user should redirect  to fashion page

Scenario: login to application
Given user is at the landing page
When user enters the username as "8176867662"
And user enters the password as "123456"