public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void JugarPartido() {
        System.out.println("El futbolista " + nombre + " juega un partido");
    }

    public void Entrenar() {
        System.out.println("El futbolista " + nombre + " procede a entrenar");
    }

    public void presentarse(){
        super.presentarse();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Demarcación: " + demarcacion);
    }
}