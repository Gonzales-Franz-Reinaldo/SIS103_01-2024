//  Desarrollar un programa de determine el máximo común divisor y 
// el mínimo común múltiplo de un número.
public class MaximoDiv_MinimoMul{

    public static void main(String[] args){
        
        int numero = 45;
        int mcd = 1;

        for(int i = 2; i <= numero; i++){
            if(numero % i == 0){
                mcd = i;
                break;
            }
        }

        int mcm = (int)(Math.pow(numero, 2) / mcd);

        System.out.println("El maximo comun divisor de " + numero + " es: " + mcd);
        System.out.println("El minimo comun multiplo de " + numero + " es: " + mcm);

    }
}