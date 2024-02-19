Feature: Login functionality of LeafTaps Application

Scenario: Login with positive Credentials
Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When  Click on Login button
Then HomePage should be displayed

Scenario: Login with negative Credentials
Given Launch the browser
And Load the url
And Enter the username as 'Demos'
And Enter the password as 'crms'
When  Click on Login button
But ErrorMessage should be displayed
 