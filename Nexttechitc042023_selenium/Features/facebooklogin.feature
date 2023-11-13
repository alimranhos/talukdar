Feature: Validate Facebook login

Scenario Outline: Validate Facebook login

Given users visit facebook homepage
When users type "<email address>" and "<password>" and click login 
Then users should be able to login facebook

Examples:
|email address|password|
|i_impose@yahoo.com |abc789|