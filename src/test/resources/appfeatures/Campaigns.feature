@campaigns
Feature: Sending email campaign


@sanity
Scenario: Create campaign
Given user is at the campaigns page
When user click on create campaign button
And user enters information
And user clicks on save button
Then Campaign should get created

@functional 
Scenario: Schedule campaign
Given user is at the campaigns page
When user click on edit campaign 
And user enters the schedule 
Then Campaign should get schedule

@regression
Scenario: Send campaign
Given user is at the campaigns page
When user click on send campaign 
Then Campaign should get sent