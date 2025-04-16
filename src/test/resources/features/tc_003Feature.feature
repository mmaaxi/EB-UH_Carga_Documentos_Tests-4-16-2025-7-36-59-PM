Feature: Validate uploading of a document that exceeds the maximum allowed size

  Scenario: Attempt to upload a file that exceeds the maximum allowed size
    Given a document is selected that exceeds the maximum allowed size
    When the user attempts to upload the document
    Then the system should detect that the file size is excessive
    And display an error message indicating the file exceeds the allowed size