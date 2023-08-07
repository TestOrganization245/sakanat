Feature: admin page
Scenario: adminetrator
Given That I AM in the admin page
And i have a furn request with a pic link "C:\Users\hp\Desktop\gg"
And a price equals to "100.0"
And with details like "Good electricity"
And it's ID is "155"
When i choose the add button
Then the furniture request must be accepted


Scenario: apartment acceptance
Given The adminstrator menu 
When I press the first choice
Then the data will be added succesfully

Scenario: Available Reservations
Given The adminstrator menu is shown
When That I choose the Available Reservations button
Then the data will be shown correctly

