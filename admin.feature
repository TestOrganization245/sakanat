Feature: admin page
Scenario: adminetrator
Given That I AM in the admin page
Then The Following choices will be valid
| Advertisment requests |
| Available reservations|
| Apartements Requests  |


Scenario: apartment acceptance
Given That I choise To accept the request 
Then the data will be added succesfully

Scenario: Available reservation
Given That I choose To view reservations 
Then available reservations must be viewed