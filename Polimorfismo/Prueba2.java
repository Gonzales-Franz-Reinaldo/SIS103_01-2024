package Polimorfismo;

/**
 * Esta clase prueba las clases Profesor y ProfesorTitular utilizando la
 * conversión descendente
 * 
 * @version 1.2/2020
 */
public class Prueba2 {
    /**
     * Método main que crea un ProfesorTitular pero instanciando la
     * clase Profesor. ¿Qué se imprimirá en pantalla? ¿Compilará el
     * programa?
     */
    public static void main(String[] args) {
        ProfesorTitular objeto = new Profesor();
        objeto.imprimir();
    }
}