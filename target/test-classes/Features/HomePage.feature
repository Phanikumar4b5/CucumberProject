Feature: I want to check customer is able to login successful

Scenario: Customer checks with valid credentials
Given customer is on login page
When customer enters valid username "phani" and password "phani"
Then login successful
And home page is displayed