Feature: Tenant Side


Scenario: Viewing the available houses
Given i am on the the tenant page and my email is "example1@example.com"
When i choose to view the available houses
Then The specified details should be available


Scenario: Student house check
Given The user of the first house is student
When I choose to check it
Then An error message to show that this is specified for student


Scenario: Student house check fail
Given The user of the third house isn't student
When I choose to check itt
Then No error message will be shown. The accomodation process continues.


Scenario: Viewing who are the students living in specific house
Given i am a tenant and my email is "example1@example.com"
And i want to see who lives in house number "1" and it's details
Then The data of people living in this house must appear
And the house's detailes must be shown


Scenario: Check a house if it's reserved or not
Given House number "1" is not reserved
Then message must be shown that it's not reserved


