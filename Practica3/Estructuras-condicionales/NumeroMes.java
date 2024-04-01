/* Hacer un programa que, dado el número de un mes, presente el 
 nombre del mes y determine la cantidad de días que tiene */

public class NumeroMes {
    public static void main(String[] args) {
        
        int numero = 4; 

        String nombreMes;
        int dias;

        switch (numero) {
            case 1:
                nombreMes = "Enero";
                dias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                dias = 28; 
                break;
            case 3:
                nombreMes = "Marzo";
                dias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                dias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                dias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                dias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                dias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                dias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                dias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                dias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                dias = 31;
                break;
            default:
                nombreMes = "Mes inválido";
                dias = -1;
                break;
        }

        System.out.println("Nombre del mes: " + nombreMes);
        System.out.println("Cantidad de dias: " + dias);
    }
}
