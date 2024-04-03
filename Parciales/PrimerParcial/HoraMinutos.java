
// Pedir una hora de la forma hora minuto y segundo mostrar la hora en el segundo siguiente
public class HoraMinutos {

    // Declaramos los atributos de la clase
    int hora;
    int minuto;
    int segundo;

    public HoraMinutos(int hora, int minuto, int segundo){

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Declaramos una función para imprimir la hora
    public void imprimirHora() {

        if(hora < 24){

            if(minuto < 60){

                if(segundo < 60){

                    int segundo_siguiente = segundo + 1;
                    System.out.println("La hora actual es: " + hora + ":" + minuto + ":" + segundo);

                    int minuto_actual = minuto;
                    if(segundo_siguiente == 60){
                        segundo_siguiente = 0;
                        minuto_actual++;
                    }
                    System.out.println("La hora del segundo siguiente es: " + hora + ":" + minuto_actual + ":" + segundo_siguiente);
                } else {
                    segundo = 0;
                    System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
                }
            }else{
                System.out.println("El valor del minuto no corresponde, valor incorrecto");
            }
        }else{
            System.out.println("El valor de la hora no corresponde, valor incorrecto");
        }
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    
    public static void main(String[] args) {

        HoraMinutos NuevaHora = new HoraMinutos(17, 20, 25);

        // Imprimimos la hora en el segundo siguiente
        NuevaHora.imprimirHora();

    }
}