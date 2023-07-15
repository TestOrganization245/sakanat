Feature: owner page

 Scenario: Adding a new residences from the owner for rent
 Given  i am on the owner page 
 When i add a new  residence for rent 
 Then the following option should be available:
 | add photos         |
 | Residence location |
 | Available services |
 | monthly rent       |
 | contact information |
 Scenario: View the residence that have been added with their details to the rental control panel
 Given I AM on the owner page pasic 
 When i view the control panel with menu of residence list
 Then the information of residence should appear when i select the number of residence in menu 
 Then The number of his tenants  appears to the owner 
 Then the number of floors of the residence will appears to owner 
 Then i ask the owner to select the floor from menu if he want
 Then i ask the owner if need to see the details of floor he selected
 
 Scenario: apartment in flooe specefic
 Given the user chose a specific apartment 
Then all the needed information will appear