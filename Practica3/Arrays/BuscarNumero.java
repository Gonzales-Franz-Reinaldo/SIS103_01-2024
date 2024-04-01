// Desarrollar un programa que, dado un número entero, busque dicho número en un array.
public class BuscarNumero{

    public static void main(String[] args){
        
        int numero = 12;
        boolean resultado = false;
        int posicion = 0;
        int[] numeros = {3, 34, 6, 7, 20, 12, 2, 28, 11, 17};

        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] == numero){

                resultado = true;
                posicion = i;
                break;
            }
            
        }

        if(resultado){

            System.out.println("El numero " + numero + " se encuentra en el Array en la posicion: " + posicion);
        }else{
            System.out.println("El numero " + numero + " no se encuentra en el array.");
        }
    }
}