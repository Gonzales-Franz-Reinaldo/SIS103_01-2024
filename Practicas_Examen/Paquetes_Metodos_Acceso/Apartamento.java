
public class Apartamento extends InmuebleVivienda {

    public Apartamento(int identificadorInmobiliario, int area, String dirección, int númeroHabitaciones, int númeroBaños) {

        super(identificadorInmobiliario, area, dirección, númeroHabitaciones, númeroBaños);
    }

    void imprimir() {
        super.imprimir(); 
    }
}
