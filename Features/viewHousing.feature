Feature: Tenant Side


Scenario: Viewing the available houses
Given i am on the the tenant page
When i choose to view the available houses
Then The specified details should be available


Scenario: Student house check
Given The user of the first house is student
When I choose to check it
Then An error message to show that this is specified for student


Scenario: Student house check fail
Given The user of the third house isn't student
When I choose to check itt
Then No error message will be shown.The accomodation process continues.