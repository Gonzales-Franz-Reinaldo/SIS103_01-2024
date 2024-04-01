/*Desarrollar un programa que calcule el factorial de un número entero positivo. 
El factorial de un número es el producto de todos los 
números enteros positivos desde 1 hasta el número en cuestión.*/

public class Factorial{

    public static void main(String[] args){
        
        int numero = 6;
        int factorial = 1;

        for(int i = 1; i <=numero; i++){
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}