Feature: Validate document upload recovery after interruption

  Scenario: Validate recovery after interruption
    Given the document upload is started
    When there is a connection interruption
    Then the system detects the interruption and notifies the user
    When the upload is restarted
    Then the system allows upload resumption without restarting the full process