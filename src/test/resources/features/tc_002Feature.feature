Feature: Validar error al cargar documento en formato inválido

  Scenario: Intentar cargar un documento en formato no permitido
    Given el usuario está en la pantalla de carga de documentos
    When el usuario selecciona un documento ".exe"
    Then el sistema rechaza la selección del archivo
    When el usuario intenta cargar el archivo
    Then se muestra un mensaje de error indicando formato no soportado