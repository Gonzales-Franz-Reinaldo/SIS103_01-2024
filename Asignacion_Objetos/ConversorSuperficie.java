
public class ConversorSuperficie {
    
    // Inicilizamos las variables de medidas
    final int FACTOR_METROS_AREA = 100;
    final int FACTOR_METROS_HECTARIA = 10000;
    final int FACTOR_METROS_KILOMETRO_CUADRADO = 1000000;
    final int FACTOR_METROS_FANEGA = 6460;
    final double FACTOR_METROS_ACRE = 4046.85;

    public int metro_cuadrado;

    public ConversorSuperficie(int metro_cuadrado){
        this.metro_cuadrado = metro_cuadrado;
    }


    // función para obtener el calculo de metros cuadrados a su area 
    public double convertirToArea(){
        double area = metro_cuadrado / FACTOR_METROS_AREA;
        return area;
    }


    // Método para obtener el calculo de hectareas a su superficie en metros cuadrados
    public double convertirToHectareas(){
        double hectareas = metro_cuadrado / FACTOR_METROS_HECTARIA;
        return hectareas;
    }


    // Método para obtener el calculo de kilómetros cuadrados a su superficie en metros cuadrados
    public double convertirToKilometrosCuadrados(){
        double kilometros_cuadrados = metro_cuadrado / FACTOR_METROS_KILOMETRO_CUADRADO;
        return kilometros_cuadrados;
    }


    // Método para obtener el calculo de fanegas a su superficie en metros cuadrados
    public double convertirToFanegas(){
        double fanegas = metro_cuadrado / FACTOR_METROS_FANEGA;
        return fanegas;
    }


    // Método para obtener el calculo de acres a su superficie en metros cuadrados
    public double convertirToAcres(){
        double acres = metro_cuadrado / FACTOR_METROS_ACRE;
        return acres;
    }

    public static void main(String[] args) {

        ConversorSuperficie conversor = new ConversorSuperficie(20000);

        System.out.println("Superficie = " + conversor.convertirToArea() + " m²");
        System.out.println("Superficie = " + conversor.convertirToHectareas() + " ha");
        System.out.println("Superficie = " + conversor.convertirToKilometrosCuadrados() + " km²");
        System.out.println("Superficie = " + conversor.convertirToFanegas() + " fanegas");
        System.out.println("Superficie = " + conversor.convertirToAcres() + " acres");
    }

}
