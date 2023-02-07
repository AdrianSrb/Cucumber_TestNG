Feature: Visit Site
  @VisitSite
  Scenario: Visit www.youtube.com
    Given I am on www.youtube.com
    When I click on Shorts button
    Then I should see the Shorts page