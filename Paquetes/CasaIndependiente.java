/**
 * Esta clase denominada CasaIndependiente modela un tipo específico
 * de casa urbana que no esta en conjunto cerrado y es completamente
 * independiente de otras casas. Tiene un atributo estatico para
 * especificar un valor del area del inmueble.
 * 
 * @version 1.2/2020
 */
public class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por area de una casa independiente
    protected static double valorArea = 3000000;

    /**
     * Constructor de la clase CasaIndependiente
     * 
     * @param identificadorInmobiliario Parametro que define el
     *                                  identificador inmobiliario de una casa
     *                                  independiente
     * @param area                      Parametro que define el area de una casa
     *                                  independiente
     * @param direccion                 Parametro que define la direccion donde se
     *                                  encuentra localizada una casa independiente
     * @param numeroHabitaciones        Parametro que define el numero de
     *                                  habitaciones que tiene una casa
     *                                  independiente
     * @param numeroBanos               Parametro que define el numero de banos
     *                                  que tiene una casa independiente
     * @param numeroPisos               Parametro que define el numero de pisos
     *                                  que tiene una casa independiente
     */
    public CasaIndependiente(int identificadorInmobiliario, int area,
            String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
                numeroHabitaciones, numeroBanos, numeroPisos);
    }

    /**
     * Método que muestra en pantalla los datos de una casa independiente
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}