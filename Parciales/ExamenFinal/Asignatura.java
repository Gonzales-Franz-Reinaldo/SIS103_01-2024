public class Asignatura {

    private String nombre;
    private Alumno[] alumnos;
    private int numeroAlumnos;

    public Asignatura(String nombre, int maxAlumnos) {
        this.nombre = nombre;
        this.alumnos = new Alumno[maxAlumnos];
        this.numeroAlumnos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumno(Alumno alumno) {

        if (numeroAlumnos < alumnos.length) {
            alumnos[numeroAlumnos] = alumno;
            numeroAlumnos++;
        } else {
            System.out.println("No se pueden agregar más alumnos a la asignatura " + nombre);
        }
    }

    public void listarCalificaciones() {
        System.out.println("Listado de calificaciones para la asignatura: " + nombre);
        for (int i = 0; i < numeroAlumnos; i++) {
            Alumno alumno = alumnos[i];

            System.out.print(alumno.getNombre() + " (" + alumno.getTipoAlumno() + "): ");
            alumno.listarCalificaciones();
            System.out.println("Promedio: " + alumno.calcularPromedio());
        }
    }

    public void porcentajeAprobados(double notaAprobatoria) {
        int aprobados = 0;
        for (int i = 0; i < numeroAlumnos; i++) {
            if (alumnos[i].calcularPromedio() >= notaAprobatoria) {
                aprobados++;
            }
        }
        double porcentaje = ((double) aprobados / numeroAlumnos) * 100;
        System.out.println("Porcentaje de aprobados en " + nombre + ": " + porcentaje + "%");
    }
}
