// Escribir un programa que dado un número entero positivo n, calcu-
// le la suma de la siguiente serie: 1 + 1/2 + 1/3 + 1/4 + 1/5 + + 1/n

public class SumaSerie{

    public static void main(String[] args) {
        
        int numero = 7;
        double contador = 1;
        
        double suma = 0;

        while(contador <= numero){
            
            suma = suma + 1 / contador;
            contador++;
        }

        System.out.println("La suma de la serie es: " + suma);
    }
}