//Escribir un programa que, dadas 5 notas finales, determine cuántas notas fueron mayores o iguales a 3.0.
public class NotasFinales{

    public static void main(String[] args){
        
        double[] notasFinales = {4.3, 3.0, 1.8, 3.0, 2.0}; 
        int notasMayoresIgual = 0;
        int i = 0;
        
        do{
            if(notasFinales[i] >= 3.0){

                notasMayoresIgual++;
            }
            i++;

        } while(i < notasFinales.length);

        System.out.println("Las notas mayores o iguales a 3.0 son: " + notasMayoresIgual);

    }
}