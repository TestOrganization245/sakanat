Feature: Tenant Side

Scenario: Furniture addition fail
Given Im the tenant with the email "example1@example.com"
When i add a pic with the url "www.test.com"
And i add price which equals 50.0
And some additional details like "have a good discount 20%"
Then an eeror message must appear that the addition operation isnt allowed until the admin accepts it