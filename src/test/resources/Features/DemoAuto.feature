@Demo-auto
Feature: DemoAuto feature
  Scenario Outline: Capacitacion de automatizacion
    Given Ingresamos la url del <ambiente>,<estable>
    And Ingresamos <usuario>,<contrasena>
    Then Seleccionamos Generate Token
    And seleccionamos <idioma>
    Then buscamos menu
    Then escogemos submenu <modulo>
    Then elegimos opcion <opcion>
    Then precionamos menuhamburguesa

    Examples:
      | ambiente | estable | usuario                    | contrasena | idioma | modulo      | opcion      |
      | UAT      | No      | rosario.chale@intelica.com | depapym    | ESP    | M&V Billing | Brand Files |

