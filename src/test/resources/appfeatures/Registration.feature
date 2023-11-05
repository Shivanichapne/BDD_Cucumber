Feature: Opening bank account
Scenario: Registration with nominee
Given User should be at accounts opening page
When user enters the data in following manner
| Eder | Smith | eder.smith@gmail.com | 9988776655 |
| Ron | Dutta | ron.dutta@gmail.com | 8877665544 |
And user clicks on submit button
Then Account should get created
