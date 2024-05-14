package Inmuebles;

/**
 * Esta clase denominada InmuebleVivienda modela un inmueble
 * destinado para la vivienda con atributos como el numero de
 * habitaciones y el numero de baños que posee
 * 
 * @version 1.2/2020
 */
public class InmuebleVivienda extends Inmueble {

    /*
     * Atributo que identifica el numero de habitación de un inmueble
     * para vivienda
     */
    protected int numeroHabitaciones;
    /*
     * Atributo que identifica el numero de baños de un inmueble para
     * vivienda
     */
    protected int numeroBaños;

    /**
     * Constructor de la clase InmuebleVivienda
     * 
     * @param identificadorInmobiliario Parametro que define el
     *                                  identificador inmobiliario de un inmueble
     *                                  para la vivienda
     * @param area                      Parametro que define el area de un inmueble
     *                                  para la
     *                                  vivienda
     * @param dirección                 Parametro que define la dirección donde se
     *                                  encuentra localizado un inmueble para la
     *                                  vivienda
     * @param numeroHabitaciones        Parametro que define el numero de
     *                                  habitaciones que tiene un inmueble para la
     *                                  vivienda
     * @param numeroBaños               Parametro que define el numero de baños
     *                                  que tiene un inmueble para la vivienda
     */
    public InmuebleVivienda(int identificadorInmobiliario, int area, String dirección, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, dirección); /*
                                                            * Invoca al
                                                            * constructor de la clase padre
                                                            */
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    /**
    * Método que muestra en pantalla los datos de un inmueble para la 
    * vivienda
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Numero de habitaciones = " + numeroHabitaciones);
        System.out.println("Numero de baños = " + numeroBaños);
    }
}
