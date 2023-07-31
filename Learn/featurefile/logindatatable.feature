@login1
Feature: Verify login feature in sauce lab application
Scenario: User able to login with user credentials
Given Launch chrome browser open sauce lab URL
When Enters the username and password 
|username|password|
|standard_user|secret_sauce|
And click login button 
Then user able to login to the app