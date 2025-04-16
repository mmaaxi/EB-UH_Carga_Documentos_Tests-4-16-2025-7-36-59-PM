Feature: Validate performance during the upload of multiple documents

  Scenario: Upload multiple documents with varying sizes
    Given I have selected multiple documents of varying sizes
    When I start the upload and measure the response time
    Then the system accepts multiple uploads in parallel
    And the system processes the uploads in a reasonable time without performance degradation