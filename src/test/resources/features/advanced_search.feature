Feature: Advanced Search on eBay  # Gherkin test cases (20')

  Scenario: Search within price range
    Given I am on the eBay homepage
    And I open advanced search
    When I search with keyword "watch" and price between "50" and "200"
    Then I see results within price range