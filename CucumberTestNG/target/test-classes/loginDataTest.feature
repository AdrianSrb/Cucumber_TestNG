Feature: Web Login with multiple data
  @dataadriven
  Scenario Outline: Attempt login with specific credentials
    #preconditie
    Given the user in on login page
    #eveniment ori declansator
    When he enters user id as "<user>"
    And he enters passward as "<password>"
    And hits submit
    #rezultat asteptat
    Then the user should be logged in successfully

    Examples:
      | user | password |
      | u1 | abc123 |
      | u2 | abc234 |
      | u3 | abc345 |
      | u4 | abc456 |
      | u5 | abc678 |
