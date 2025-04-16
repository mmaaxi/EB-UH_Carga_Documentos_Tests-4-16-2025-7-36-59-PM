Feature: Validar carga de documento en formato válido

  Scenario: Cargar un documento PDF válido en el sistema
    Given El usuario ha seleccionado un documento en formato PDF válido
    When El usuario hace clic en el botón 'Cargar'
    Then El documento se carga correctamente y se muestra una confirmación