Feature: Basic Search on eBay  # Gherkin test cases (20')

  Scenario: Basic Search
    Given I am on the eBay homepage
    When I search for "laptop"
    Then I see results for "laptop"