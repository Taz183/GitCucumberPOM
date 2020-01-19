Feature: CRM application testing

Scenario: Login with incorrect username and correct password

Given user opens browser
Then user is on login page
Then user logs into app
Then validate home page title
