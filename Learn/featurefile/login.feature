@login2
Feature: Verify login feature in saucelab application
Scenario: User should be able to login with correct user credentials
Given Launch the chrome browser open sauce lab URL
When User enters the username "standard_user" and password "secret_sauce"
And clicks on login button 
Then user should be able to login to the app