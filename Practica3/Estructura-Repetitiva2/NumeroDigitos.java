// Escribir un programa que, dado un número, determine cuántos dígitos tiene.
public class NumeroDigitos{

    public static void main(String[] args){
        
        int numero = 2323456;
        int aux = numero;
        int contador = 0;

        do{
            numero /= 10;
            contador++;

        } while(numero != 0);
        
        System.out.println("El número " + aux + " tiene: " + contador + " dígitos");
    }
}