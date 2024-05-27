package polimorfismo;

/**
 * Esta clase denominada ProfesorTitular es una subclase de Profesor
 * 
 * @version 1.2/2020
 */
// public class ProfesorTitular extends Profesor {
//     /**
//     * Método que sobreescribe el método imprimir heredado de la clase 
//     * padre Profesor
//     */
//     protected void imprimir() {
//         System.out.println("Es un profesor titular.");
//     }
// }


public class ProfesorTitular extends Profesor {

    int anos = 0;
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }

    protected void imprimirAnos() {
        System.out.println("Años = " + anos);
    }
}