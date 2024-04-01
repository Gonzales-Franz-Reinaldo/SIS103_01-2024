public class NumeroPerfecto {
/** Método main*/
    public static void main(String args[]) {
        int suma = 0; // Variable que sumará los divisores del número
        int numero = 496; // Número a determinar si es perfecto o no
        int i = 1; /* Variable utilizada para determinar los divisores del número */

        // Calcula la suma de todos los divisores
        do {
        // Si i es un divisor del número, se va acumulando
            if (numero % i == 0) {
                suma = suma + i;
            }
            i++;
        } while (i <= numero / 2); /* No existen divisores mayores a la mitad del numero */
        // Verifica si la suma de los divisores del numero es igual al numero
        if (suma == numero) {
        System.out.println(numero + " es un numero perfecto");
        } else {
        System.out.println(numero + " no es un numero perfecto");
        }
    }
}
