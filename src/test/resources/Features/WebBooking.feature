@Web-Booking
Feature: WebBooking feature
  Scenario Outline: Reserva de alojamiento
    Given Ingresamos la url de Booking <web>
    And buscamos <lugar>,<habitacion>,<fechainicio>,<fechafin>,<cantadultos>,<cantninos>
    Then Seleccionamos Buscar
    And elegimos <item2>
    Then reservamos <reservar>
    Then precionamos reservare
    Then llenamos datos de reserva
    Then escogemos <ultimosdatos>
    Then completamos <completarreserva>

    Examples:
      | web     | lugar | fechainicio | fechafin   | habitacion | cantadultos | cantninos |
      | Booking | Cusco | 14/08/2014  | 28/08/2024 | 1          | 2           | 1         |