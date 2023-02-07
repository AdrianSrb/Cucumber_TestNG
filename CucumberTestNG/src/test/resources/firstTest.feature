Feature: Web Login
  Scenario: User should be able to login with valid credentials
    Given the user in on login page
    When the user enter valid credentials
    And hits submit
    Then the user should be logged in successfully