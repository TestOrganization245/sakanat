Feature: User Login

  Scenario: Failed Login Attempt
    Given I am on the login page
    When I enter my email as "example1@example.com"
    And I enter my password as "password"
    Then I should see an "error message"
    
    
  Scenario: Successful Login
    Given I am on the login page
    When I enter my email as1 "example1@example.com"
    And I enter my password as1  "password1"
    Then I should see a welcome message 
  
