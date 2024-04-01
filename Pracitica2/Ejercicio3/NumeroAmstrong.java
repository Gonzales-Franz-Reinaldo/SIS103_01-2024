public class NumeroAmstrong {

    public static void main(String args[]) {
        int numeroOriginal, ultimoDigito; /* Variables para el número original y su último dígito */
        double digitos; // Cantidad de digitos que tiene el número
        double suma = 0; /* Variable que sumará los digitos elevados a su cantidad de digitos */
        int numero = 371; /* Número a determinar si es un número de Amstrong */

        numeroOriginal = numero; /* Copia el valor del numero para su procesamiento */
        digitos = Math.floor(Math.log10(numero)) + 1; /* Calcula el total de digitos del numero */
        // Calcula la suma de potencia de digitos
        
        while (numero > 0) {
            ultimoDigito = numero % 10; // Extrae el último dígito
        // Calcula la suma de potencias del último dígito
        
            suma = suma + Math.pow(ultimoDigito, digitos);
            numero = numero / 10; // Elimina el último dígito
        }
        //  Verifica si es un numero de Armstrong si la suma obtenida es igual al numero */
        if (numeroOriginal == suma) {
            System.out.println(numeroOriginal + " es un número de Amstrong");
        } else {
        System.out.println(numeroOriginal + " no es un número de Amstrong");
        }
    }
}
