Feature: Leaftaps Lead

Background:
Given Open the Chrome Browser
And Maximize the Browser
And set the Implicit Timeouts
And Load the Leaftaps URL

Scenario Outline: TC001 Login LeafTap
And Enter the Username as <username>
And Enter the password as <password>
When Click on the Login Button
Then  Verify Login Successfull
And Click on the CRM link
Examples:
|username|password|
|DemoSalesManager|crmsfa|