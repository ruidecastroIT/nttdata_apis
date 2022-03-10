Feature: feature to search automation in google

  Scenario: Check automation wikipedia
    Given user is on google page
    When search information about automation
    And click on a wikipedia result link
    Then do a screenshot
