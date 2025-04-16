Feature: Validar permisos de usuario para cargar documentos
  Scenario: Intentar cargar documentos sin permiso
    Given el usuario inicia sesión sin permisos de carga
    When intenta acceder a la funcionalidad de carga
    Then se muestra un mensaje de error o acceso denegado