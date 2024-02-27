Feature: Login functionality of LeafTaps Application

#Background:
#Given Launch the browser
#And Load the url

@smoke
Scenario: Login with positive Credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When  Click on Login button
Then HomePage should be displayed

@functional @regression
Scenario: Login with negative Credentials
Given Enter the username as 'Demos'
And Enter the password as 'crms'
When  Click on Login button
But ErrorMessage should be displayed
 