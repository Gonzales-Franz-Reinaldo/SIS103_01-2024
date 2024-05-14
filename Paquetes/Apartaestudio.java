package Inmuebles;

/**
 * Esta clase denominada Apartaestudio modela un tipo específico de
 * apartamento que tiene una sola habitacion.
 * 
 * @version 1.2/2020
 */
public class Apartaestudio extends Apartamento {
    // Atributo que identifica el valor por area de un apartaestudio
    protected static double valorArea = 1500000;

    /**
     * Constructor de la clase Apartaestudio
     * 
     * @param identificadorInmobiliario Parametro que define el
     *                                  identificador inmobiliario de un
     *                                  apartaestudio
     * @param area                      Parametro que define el area de un
     *                                  apartaestudio
     * @param direccion                 Parametro que define la direccion donde se
     *                                  encuentra localizado un apartaestudio
     * @param numeroHabitaciones        Parametro que define el numero de
     *                                  habitaciones que tiene un apartaestudio
     * @param numeroBaños               Parametro que define el numero de baños
     *                                  que tiene un apartaestudio
     */
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion,
            int numeroHabitaciones, int numeroBaños) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitacion y un solo baño
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }

    /**
     * Método que muestra en pantalla los datos de un apartaestudio
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
