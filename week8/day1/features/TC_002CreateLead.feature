Feature: CreateLead functionality of LeafTaps Application

@smoke
Scenario Outline: Create Lead with multiple data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When  Click on Login button
Then HomePage should be displayed
When Click on crmsfa link
And Click Leads link
And Click CreateLead Link
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on CreateLead button
Then ViewLeads page should be displayed as <companyname>


Examples:
|companyname|firstname|lastname|
|TestLeaf|Subraja|S|
|Qeagle|Princilla|R|
 