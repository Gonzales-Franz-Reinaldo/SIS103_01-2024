// Desarrollar un programa que determine el elemento mayor y menor de un array de enteros
public class MayorMenor{

    public static void main(String[] args){

        int[] numeros = {3, 14, 6, 7, 20, 12, 10, 28, 1, 17};
        int mayor = 0;
        int menor = numeros[0];


        for(int i = 0; i < numeros.length; i++){

            // System.out.println(numeros[i]);

            if(numeros[i] > mayor){
                mayor = numeros[i];
            }

            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("El mayor de los elementos del array es: " + mayor);
        System.out.println("El menor de los elementos del array es: " + menor);
    }
}