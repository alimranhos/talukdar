Feature: Yahoo sign up

In order to verify search
as a uger
i want to Yahoo sign up

Scenario Outline:
Given Users visit yahoo homepage
When Users type "<firstname>" "<surname>" and "<email>" "<password>"
Then Users select dropdown month and type "<day>" "<year>" and click on continue buttom 

Examples:
|firstname|surname|email|password|day|year|
|Imran|-|i_mran|Bangladesh123*|15|2000|