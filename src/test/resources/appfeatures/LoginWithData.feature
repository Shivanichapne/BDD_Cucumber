Feature: Login functionality with data
Scenario: login to the application with data
Given User is at 1 loginpage
When User enters the username as "testuser"
And User enters the password as "Test@1234"
And User click on login button
Then User should get logged into app
