Feature: Validate system upload integration with the database

  Scenario: Validate integration of file upload with the database
    Given the user has a valid document to upload
    When the user uploads the document
    Then the document should be stored correctly in the database
    When the user checks the database entry for the document
    Then the database should reflect the correct document information