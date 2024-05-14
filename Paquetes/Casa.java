package Inmuebles;

/**
 * Esta clase denominada Casa modela un tipo específico de inmueble
 * destinado para la vivienda con atributos como el numero de pisos
 * que tiene una casa.
 * 
 * @version 1.2/2020
 */
public class Casa extends InmuebleVivienda {
    protected int numeroPisos; /*
                                * Atributo que identica el numero de
                                * pisos que tiene una casa
                                */

    /**
     * Constructor de la clase Casa
     * 
     * @param identificadorInmobiliario Parametro que define el
     *                                  identificador inmobiliario de una casa
     * @param area                      Parametro que define el area de una casa
     * @param dirección                 Parametro que define la dirección donde se
     *                                  encuentra localizada una casa
     * @param numeroHabitaciones        Parametro que define el numero de
     *                                  habitaciones que tiene una casa
     * @param numeroBaños               Parametro que define el numero de baños
     *                                  que tiene una casa
     * @param numeroPisos               Parametro que define el numero de pisos
     *                                  que tiene una casa
     */
    public Casa(int identificadorInmobiliario, int area, String dirección,
            int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, dirección, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    /**
    * Método que muestra en pantalla los datos de una casa
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Numero de pisos = " + numeroPisos);
    }
}
