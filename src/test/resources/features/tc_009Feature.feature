Feature: Validar seguridad y protección de documentos cargados

  Scenario: Cargar un documento y verificar su almacenamiento seguro
    Given el usuario está autenticado en la plataforma
    When el usuario carga un documento
    Then el documento se guarda en un lugar seguro y encriptado

  Scenario: Intentar acceder al documento sin permisos adecuados
    Given el usuario no tiene permisos adecuados para el documento
    When el usuario intenta acceder al documento
    Then el acceso al documento es denegado, mostrando mensaje de seguridad