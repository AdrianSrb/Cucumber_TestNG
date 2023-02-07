Feature: Beer cans
@bearOpened
  Scenario Outline: Counting beer cans
    Given I have <opening balance> beer cans
    And I have drunk <processed> beer cans
    When I go to my fridge
    Then I should have <in stock> beer cans

    Examples:
      | opening balance | processed | in stock |
      | 123             | 50        | 74       |
      | 1               | 1         | 0        |