Feature: User Login

  Scenario: Successful Login
    Given I am on the login page
    When I enter my email as "<email>"
    And I enter my password as "<password>"
    And I click on the login button
    Then I should be redirected to the home page
    And I should see a welcome message
    
 