Feature: Check File Existence


Scenario: Check if the file containing residence details exists
    Given there is a file "datahouse" containing residence details on datahouse file
    When the system checks if the file exists
    Then the system should confirm that the file exists
 

Scenario: Check if a non-existing file exists
Given there is a file "non_existing_file" containing residence details on datahouse file
When the system checks if the file exists
Then the system should confirm that the file does not exist



Scenario: Check if the file containing residence details is empty
  Given there is a file "empty_file" containing residence details (empty file)
  When the system checks if the file is empty
  Then the system should confirm that the file is empty
  
  
Scenario: Check if the file is readable
Given there is a file "datahouse" containing residence details on datahouse file
When the system checks if the file is readable
Then the system should confirm that the file is readable