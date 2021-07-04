Feature: I want to check all links are working as expected

Scenario: Verify link is opening in seperate tab
Given user is on practice page
When user clicks on any link
Then link should open in seperate tab

Scenario: Verify link functionality
Then no link should be broken
And verify the link title