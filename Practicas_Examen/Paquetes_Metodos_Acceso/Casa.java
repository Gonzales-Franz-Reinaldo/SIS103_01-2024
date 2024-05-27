
public class Casa extends InmuebleVivienda {
    protected int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String dirección, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        
        super(identificadorInmobiliario, area, dirección, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos = " + numeroPisos);
    }
}
