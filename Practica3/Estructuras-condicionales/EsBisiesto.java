// Hacer un programa que determine si un año es bisiesto o no
public class EsBisiesto{

    public static void main(String[] args){

        int anio = 2024;

        if((anio % 4 == 0 || anio % 400 == 0) && anio % 100 != 0){

            System.out.println("El año " + anio + " es bisiesto");
        }else{
            
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}