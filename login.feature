Feature: User Login

  Scenario: Failed Login Attempt
    Given I am on the login page
    When I enter my email as "<invalid_email>"
    And I enter my password as "<invalid_password>"
    Then I should see an error message
    
    
  Scenario: Successful Login
    Given I am on the login page
    When I enter my email as "<email>"
    And I enter my password as "<password>"
    And I click on the login button
    Then I should be redirected to the home page
    And I should see a welcome message 
  
