package Inmuebles;

/**
 * Esta clase denominada Apartamento modela un tipo de inmueble
 * específico destinado para la vivienda.
 * 
 * @version 1.2/2020
 */
public class Apartamento extends InmuebleVivienda {
    /**
     * Constructor de la clase Apartamento
     * 
     * @param identificadorInmobiliario Parametro que define el
     *                                  identificador inmobiliario de un apartamento
     * @param area                      Parametro que define el area de un
     *                                  apartamento
     * @param dirección                 Parametro que define la dirección donde se
     *                                  encuentra localizado un apartamento
     * @param númeroHabitaciones        Parametro que define el número de
     *                                  habitaciones que tiene un apartamento
     * @param númeroBaños               Parámetro que define el número de baños
     *                                  que tiene un apartamento
     */
    public Apartamento(int identificadorInmobiliario, int area, String dirección, int númeroHabitaciones, int númeroBaños) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, dirección,
                númeroHabitaciones, númeroBaños);
    }

    /**
     * Método que muestra en pantalla los datos de un apartamento
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
