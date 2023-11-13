Feature: Validate Buy Ticket button

@tag1
Scenario: Validate Buy Ticket button

Given User visit nexteticket homepage
When User clicks Buy Ticket 
Then User is able to see ticket catagory like  EARLY BIRD , REGULAR, PLATINUM
