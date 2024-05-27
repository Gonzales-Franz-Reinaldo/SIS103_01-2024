public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {

        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void DirigirPartido() {
        System.out.println("El entrenador " + nombre + " dirige un partido");
    }

    public void DirigirEntrenamiento() {
        System.out.println("El entrenador " + nombre + " dirige un entrenamiento");
    }

    public void presentarse(){
        super.presentarse();
        System.out.println("ID de Federación: " + idFederacion);
    }
}