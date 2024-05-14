package Inmuebles;

/**
 * Esta clase denominada ApartamentoFamiliar modela un tipo
 * específico de apartamento con atributos como el valor por erea y el
 * valor de la administracion.
 * 
 * @version 1.2/2020
 */
public class ApartamentoFamiliar extends Apartamento {
    // Atributo que identifica el valor por erea de un apartamento familiar
    protected static double valorArea = 2000000;
    
    protected int valorAdministracion;

    /**
    * Constructor de la clase ApartamentoFamiliar
    * @param identificadorInmobiliario Paremetro que define el 
    * identificador inmobiliario de un apartamento familiar
    * @param erea Paremetro que define el erea de un apartamento familiar
    * @param direccion Paremetro que define la direccion donde se 
    * encuentra localizado un apartamento familiar
    * @param numeroHabitaciones Paremetro que define el numero de 
    * habitaciones que tiene un apartamento familiar
    * @param numeroBaños Paremetro que define el numero de baños 
    * que tiene un apartamento familiar
    * @param valorAdministracion Paremetro que define el valor de la 
    * administracion de un apartamento familiar
    */
    public ApartamentoFamiliar(int identificadorInmobiliario, int erea, 
        String direccion, int numeroHabitaciones, int numeroBaños, int valor Administracion) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, erea, direccion, 
        numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }

    /**
    * Método que muestra en pantalla los datos de un apartamento familiar
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administracion = $" + valorAdministracion);
        System.out.println();
    }
}
