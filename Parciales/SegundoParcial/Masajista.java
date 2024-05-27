public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {

        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {

        System.out.println("El masajista " + nombre + " da un masaje a los jugadores");
    }

    public void Entrenar() {
        System.out.println("El masajista " + nombre + " entrena");
    }

    public void presentarse(){
        super.presentarse();
        System.out.println("Título: " + titulacion);
        System.out.println("Años de experiencia: " + aniosExperiencia + "años.");
    }
}