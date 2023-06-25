Feature: User Sign-Up
  As a user
  I want to sign up
  So that I can access the application

  Scenario: Successful Sign-Up
    Given I am on the sign-up page
    When I enter my name as "<name>"
    And I enter my email as "<email>"
    And I enter my password as "<password>"
    And I click on the sign-up button
    Then I should be redirected to the home page
    And I should see a welcome message
    