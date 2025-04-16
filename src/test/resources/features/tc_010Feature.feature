Feature: Validar manejo de errores en documento corrupto

  Scenario: Cargar documento corrupto
    Given que el usuario selecciona un documento corrupto
    When el usuario intenta cargar el documento
    Then el sistema detecta la corrupción del archivo
    And se muestra un mensaje de error indicando que el documento está dañado