@Registro
Feature: Registro de usuarios
  Como gerente de servicios
  QUiero un fomulario
  Para registrar usuarios en la app web
  @Valido
  Scenario: Registrar usuarios de manera correcta
    Given Que yo ingreso al aplicación web 
    When yo me logue al portal del sistema
    And visualice un formulario de registro de usuarios
    And y ingrese los datos a cada campo de manera correcta
    And haga clic en el boton de registrar usuario
	Then debo poder visulizar un mensaje modal en donde indique que el usuario fue    registrado de manera correcta