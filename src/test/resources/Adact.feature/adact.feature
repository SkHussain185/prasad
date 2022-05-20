Feature: verifying adact details
Scenario: Verifying the Adact username and password
Given User is on the Adact page
When User should enter username and password
And user click on the login 
Then user should verify success msg