// Desarrollar un programa que busque elementos comunes en dos 
// arrays de enteros
public class ElementosComunes{

    public static void main(String[] args) {
        
        int[] numeros1 = {3, 34, 6, 7, 20, 12, 12, 8, 11, 17};
        int[] numeros2 = {1, 2, 13, 4, 5, 6, 17, 8, 9, 10};
        boolean resultado = false;
    
        System.out.print("Elementos comunes en ambos arrays: ");

        for(int i = 0; i < numeros1.length; i++) {
            for(int j = 0; j < numeros2.length; j++) {

                if (numeros1[i] == numeros2[j]) {

                    System.out.print(numeros1[i] + ", ");
                    resultado = true;
                    break;
                }
            }
        }
        
        if(!resultado){
            System.out.println("No hay elementos comunes");
        }
    }
}