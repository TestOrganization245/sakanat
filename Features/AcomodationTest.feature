Feature: Tenant Side


Scenario: Acommodation process Check
Given I'm the tenant with the email "example1@example.com"
And I tried to reserve the first house from the owner
Then The accomodation process must succeed


Scenario: Acommodation check
Given I'm thee tenant with the email "example1@example.com"
And I tried to reserve the fourth house from the owner
Then The accomodation process must fail because it's already fully reserved