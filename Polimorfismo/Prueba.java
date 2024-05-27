

// package polimorfismo;

/**
 * Esta clase prueba las clase Profesor y ProfesorTitular utilizando el
 * polimorfismo
 * 
 * @version 1.2/2020
 */
// public class Prueba {
//     /**
//      * Método main que crea un Profesor pero instanciando la clase
//      * ProfesorTitular. ¿Qué se imprimirá en pantalla?
//      */
//     public static void main(String[] args) {
//         Profesor profesor1 = new ProfesorTitular();
//         profesor1.imprimir();
//     }
// }


// public class Prueba { 
//     public static void main(String[] args) { 
//         Profesor profesor1 = new ProfesorTitular();
//         Profesor profesor2 = (Profesor) profesor1;
//         profesor2.imprimir();
//     } 
// }


package Polimorfismo;

// public class Prueba {
//     public static void main(String[] args) {
//         Profesor profesor1 = new ProfesorTitular();
//         ProfesorTitular profesor2 = (Profesor) profesor1;
//         profesor2.imprimir();
//     }
// }



import java.util.*;

public class Prueba {

    Vector profesores;
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.profesores = new Vector();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesor2 = new ProfesorTitular();
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);

        for(int i = 0; i < prueba.profesores.size(); i++) {
            Profesor p = (Profesor) prueba.profesores.elementAt(i);
            p.imprimir();
        }
    }
}