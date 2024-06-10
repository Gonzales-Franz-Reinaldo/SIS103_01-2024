import java.util.Scanner;

public class GestionAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del profesor: ");
        String nombreProfesor = scanner.nextLine();
        Profesor profesor = new Profesor(nombreProfesor, 10);

        System.out.println("Ingrese el nombre de la asignatura: ");
        String nombreAsignatura = scanner.nextLine();
        Asignatura asignatura = new Asignatura(nombreAsignatura, 30);
        profesor.agregarAsignatura(asignatura);

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = Integer.parseInt(scanner.nextLine());

        // Recorremos a ingresar todos los alumnos
        for (int i = 0; i < numAlumnos; i++) {

            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            String nombreAlumno = scanner.nextLine();

            System.out.println("El alumno es presencial o a distancia? (P/D):");
            String tipoAlumno = scanner.nextLine();

            // String tipo = "";
            // if(tipoAlumno == "P"){
            //     tipo = "Presencial";
            // }else{
            //     tipo = "Distancia";
            // }

            // Alumno alumno = new Alumno(nombreAlumno, tipo, 10);

            Alumno alumno = new Alumno(nombreAlumno, tipoAlumno.equalsIgnoreCase("P") ? "Presencial" : "Distancia", 10);
            
            asignatura.agregarAlumno(alumno);

            System.out.println("Ingrese el número de calificaciones del alumno " + nombreAlumno + ":");
            int numCalificaciones = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < numCalificaciones; j++) {
                System.out.println("Ingrese la calificación " + (j + 1) + ":");
                double calificacion = Double.parseDouble(scanner.nextLine());
                alumno.agregarCalificacion(calificacion);
            }
        }

        profesor.listarCalificaciones();

        System.out.println("Ingrese la nota de aprobación: ");
        double notaAprobatoria = Double.parseDouble(scanner.nextLine());

        profesor.porcentajeAprobados(nombreAsignatura, notaAprobatoria);

        scanner.close();
    }
}
