Feature: View Product Details  # Gherkin test cases (20')

  Scenario: Navigate to product details
    Given I search for "iphone 13" on the homepage
    When I click the first result
    Then I should see the product details page