Feature: Profile functionality
Scenario: Add Profile
Given user is at home page
When user clicks on add profile button
And user enters the information
Then profile should get created

Scenario: Update Profile
Given user is at home page
When user clicks on edit profile button
And user updates the information
Then profile should get updated

Scenario: delete Profile
Given user is at home page
When user clicks on delete profile button
Then profile should get deleted