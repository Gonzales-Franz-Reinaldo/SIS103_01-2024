public class Profesor {
    private String nombre;
    private Asignatura[] asignaturas;
    private int numeroAsignaturas;

    public Profesor(String nombre, int maxAsignaturas) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[maxAsignaturas];
        this.numeroAsignaturas = 0;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        if (numeroAsignaturas < asignaturas.length) {
            asignaturas[numeroAsignaturas] = asignatura;
            numeroAsignaturas++;
        } else {
            System.out.println("No se pueden agregar más asignaturas para el profesor " + nombre);
        }
    }

    public void listarCalificaciones() {
        System.out.println("Listado de calificaciones para el profesor: " + nombre);
        for (int i = 0; i < numeroAsignaturas; i++) {
            asignaturas[i].listarCalificaciones();
        }
    }

    public void porcentajeAprobados(String nombreAsignatura, double notaAprobatoria) {
        for (int i = 0; i < numeroAsignaturas; i++) {

            if (asignaturas[i].getNombre().equals(nombreAsignatura)) {
                
                asignaturas[i].porcentajeAprobados(notaAprobatoria);
                return;
            }
        }
        System.out.println("Asignatura no encontrada.");
    }
}
