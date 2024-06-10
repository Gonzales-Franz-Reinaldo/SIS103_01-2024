public class Alumno {
    private String nombre;
    private String tipoAlumno;   // Este es de tipoAlumno presencial o a distancia
    private double[] calificaciones;
    private int nroCalificaciones;

    public Alumno(String nombre, String tipoAlumno, int maxCalificaciones) {
        this.nombre = nombre;
        this.tipoAlumno = tipoAlumno;
        this.calificaciones = new double[maxCalificaciones];
        this.nroCalificaciones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAlumno() {
        return tipoAlumno;
    }

    public void agregarCalificacion(double calificacion) {

        if (nroCalificaciones < calificaciones.length) {
            calificaciones[nroCalificaciones] = calificacion;
            nroCalificaciones++;
        } else {
            System.out.println("No se pueden agregar más calificaciones para el alumno: " + nombre);
        }
    }

    public double calcularPromedio() {
        if (nroCalificaciones == 0) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < nroCalificaciones; i++) {
            suma += calificaciones[i];
        }
        double promedio = suma / nroCalificaciones;
        return promedio;
    }

    public void listarCalificaciones() {
        System.out.print("Calificaciones de los Alumnos: ");
        for (int i = 0; i < nroCalificaciones; i++) {
            System.out.print(calificaciones[i] + " ");
        }
        System.out.println();
    }
}
