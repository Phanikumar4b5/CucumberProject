Feature: I want to check login functionality in my application

Scenario: Customer checks with valid credentials
Given customer is on login page
When customer enters valid username "phani" and password "phani"
Then login successful
And home page is displayed

Scenario: Customer checks with Invalid credentials
Given customer is on login page
When customer enters invalid username "reeet" and password "tetetete"
Then error message should be thrown