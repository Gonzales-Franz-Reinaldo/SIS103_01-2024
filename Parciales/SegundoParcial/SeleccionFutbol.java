
public class SeleccionFutbol {

    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void Concentrarse() {

        System.out.println("La seleccion de Futbol se concentra");
    }

    public void Viajar() {

        System.out.println("La seleccion de Futbol viaja");
    }

    public void presentarse(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}

