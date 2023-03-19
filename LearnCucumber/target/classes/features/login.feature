Feature: Leaftaps - Login

Background:
Given Open the browser and launch leaftaps application using 'http://leaftaps.com/opentaps/control/login'

@Regression @Smoke
Scenario Outline: Verify the login to leaftaps application with valid credentials
Given Enter username as <username>
And Enter password as <password>
When Click on Submit button
Then Verify the success message in the home page

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@Smoke
Scenario: Verify the login to leaftaps application with valid username and no password
And Enter username as 'Demosalesmanager'
When Click on Submit button
But Verify the error message in the login page

@Regression
Scenario: Verify the login to leaftaps application with no username and invalid password
And Enter password as 'dummy'
When Click on Submit button
But Verify the error message in the login page
