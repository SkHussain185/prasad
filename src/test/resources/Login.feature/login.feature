Feature: verifying facebook details

Scenario: verifying facebook login with invalid credentials

Given user is on the facebook page
When user should enter username and password
And user should click login button
Then user should verify success msg 