Feature: owner page

 Scenario: add recidense for rent 
 Given  I Am on owner page 
 When i add the details the recidense
 Then the following option should be to available in my adding:
 | add photos         |
 | Residence location |
 | Available services |
 | monthly rent       |
 | contact information |
 
 
 Scenario: View the residence list on the control panel
Given I am on the owner page basic
When I view the control panel with the menu of residence list
Then the information of residences should appear on the list


Scenario Outline: View the number of floors for a residence
  Given I am on the owner page basic residence
  When I view the control panel with the menu of residence list
  And I select a residence from the list with ID "<residence_id>"
  Then the number of floors for the selected residence should be "<expectednumFloor>"

Examples:
  | residence_id | expectednumFloor          |
  | 1            | 1                         |
 
 
 
 
Scenario: Select a floor from the menu for a residence
    Given the residences list is loaded from file
    When I select a residence with ID "1" from the list
    And I ask the owner to select a floor with number "2" from the menu
    Then the owner should be able to select a floor "2" for the selected residence "1"

Scenario: Select a floor from the menu for another residence
    Given the residences list is loaded from file
    When I select a residence with ID "2" from the list
    And I ask the owner to select a floor with number "1" from the menu
    Then the owner should be able to select a floor "1" for the selected residence "2"
    
    
Scenario: Select a floor from the menu for yet another residence
    Given the residences list is loaded from file
    When I select a residence with ID "3" from the list
    And I ask the owner to select a floor with number "3" from the menu
    Then the owner should be able to select a floor "3" for the selected residence "3"




Scenario Outline: View the details of the selected residence floor
    Given I am on the owner page basic
    When I view the control panel with the menu of residence list
    And I select a residence with ID "<ResidenceId>" from the list
    And I ask the owner to select a floor with number "<FloorNumber>" from the menu
    Then the details of the selected residence floor should appear to the owner

    Examples:
    | ResidenceId | FloorNumber |
    | 3           | 3           |

   
Scenario Outline: Read Residence Details from a File
    Given there is a file "<file>" containing residence details
    When the system reads the residence details from the file
    Then the system should correctly extract and store the residence details for residence ID "<residenceId>"
    And the residence details for residence ID "<residenceId>" should match the expected values:
      | Apartment ID    | Floor ID | Number of Bathrooms | Number of Bedrooms | Is There a Balcony |
      | <apartmentId>   | <floorId> | <numBathrooms>      | <numBedrooms>      | <hasBalcony>       |

Examples:
  | file                      | residenceId | apartmentId | floorId | numBathrooms | numBedrooms | hasBalcony |
  | datahouse                 | 2           | 5           | 1       | 3            | 1           | true       |
  | datahouse                 | 1           | 5           | 1       | 2           | 3          | false      |
      
      


Scenario: View the details of the selected residence floor
    Given there is a file "datahouse" contain residence details
    When the system reads the residence details from the file datahouse
    And the system should correctly extract and store the residence details (actual) for residence ID "1"
    Then the residence details for residence ID "1" should not match the expected values:
      | residenceId | apartmentId | floorId | numBathrooms | numBedrooms | hasBalcony |
      | 4           | 5           | 1       | 30           | 78          | false      |
 
 
 
 
 
Scenario Outline: Log Out or Go Back
Given I am on the owner page pasic
When I select "<option>" from the control panel
Then I should be "<outcome>"

Examples:
  | option          | outcome                    |
  | log out         | logged out  from menu      |
  | go back to menu | taken back to main menu    |
  
  

 
 
 
