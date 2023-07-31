@simplecode @login1
Feature: smoke testing for google search
Scenario: validating google search with correct statements
Given open google and launch the url
When user type value in the search "Java@com" and hit enter
Then user should get proper result on screen