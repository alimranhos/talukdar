Feature: Validate ticket category button


@tag2
Scenario: Validate ticket category button
Given User goes to nexteticket homepage
When User click on EARLY BIRD buy ticket and REGULAR buy ticket and PLATINUM buy ticket
Then User is able to see schedule multi speaker page