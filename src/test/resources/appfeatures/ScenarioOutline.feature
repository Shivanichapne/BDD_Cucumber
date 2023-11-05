Feature: Signup functionality

Scenario Outline: Signup to application with multiple test data
Given User is at signup page
When User enters name "<name>" in the form
And User enters the age <age>
And User confirms the gender as "<gender>"
Then User will get create

Examples:
| name | age | gender | 
| Eder | 23 | Male | 
| Daniel | 24 | Male |
| Diana | 25 | Female |