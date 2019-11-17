Feature: Leaftaps Lead

Background:
Given Open the Chrome Browser
And Maximize the Browser
And set the Implicit Timeouts	
And Load the Leaftaps URL


Scenario Outline: TC002 Create a new Lead
And Enter the Username as <username>
And Enter the password as <password>
When Click on the Login Button
Then  Verify Login Successfull
When Click on the CRM link
Then Verify the Home Page
And click on the Lead Button
And click on the Create Lead Button
And Enter the Company Name  <companyName>
And Enter the First Name <firstName>
And Enter the Last Name <lastName>
When Click on the CreateLead Button
Then  Verify Lead is created Successfull
Examples:
|username|password|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|GCIT|kali|Arasu|