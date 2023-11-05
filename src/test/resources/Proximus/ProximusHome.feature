Feature: Home page functionality 

Scenario: verify title of page
Given user should be on home page
Then home page title should contains "Welcome to Proximus – Internet, mobile, phone and TV | Proximus"

Scenario: checkout deals section
Given user should be on home page
When user click on expect all cookies
When user clicks on Packs
Then user should redirect to Packs page contains "Packs | Proximus"