/*Escribir un programa que calcule los primeros n números de 
Fibonacci. Los números de Fibonacci comienzan con 0 y 1, y cada 
término siguiente es la suma de los anteriores: 0, 1, 2, 3, 5, 8, 13, 
21, … */

public class NFibonacci{

    public static void main(String[] args) {
        
        int n = 10;
        int num1 = 0;
        int num2 = 1;
        int contador = 0;

        System.out.println("Los primeros " + n + " números de Fibonacci son: ");

        while(contador < n){

            System.out.println(num1);
            int serie = num1 + num2;
            num1 = num2;
            num2 = serie;

            contador++;
        }
    }
}