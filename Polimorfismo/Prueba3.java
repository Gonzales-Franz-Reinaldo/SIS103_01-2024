package Polimorfismo;

/**
 * Esta clase prueba las clases Profesor y ProfesorTitular utilizando
 * métodos polimórficos
 * 
 * @version 1.2/2020
 */
public class Prueba3 {
    /**
     * Método main que crea un ProfesorTitular pero en un objeto tipo
     * Profesor.
     * ¿Qué se imprimirá en pantalla? ¿Compilará el programa?
     */
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        profesor1.imprimirAños();
    }
}





