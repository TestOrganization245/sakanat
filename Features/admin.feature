Feature: admin page
Scenario: viewAdminstrator
Given I am an admin whose email is "example3@example.com"
And my password is "password3"
When I press login button
Then The Following choices will be available
| Advertisment requests |
| Available reservations|
| Apartements Requests  |


Scenario: Furniture acceptance
Given That I choose To accept some Furniture request
Then error message must show that it has been added successfully


Scenario: Check if there are new apartments to be accepted
Given That I choose to accept some apartment request
Then the system should display an appropriate message about new apartment requests
And the system should indicate if there are new apartments to be accepted