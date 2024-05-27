// package Practicas_Examen.Sobrecarga_Metodos;

public class Empleado {
    int id;
    String nombre;
    String apellido;
    int edad;

    public Empleado() {
        this.id = 100;
        this.nombre = "Nuevo empleado";
        this.apellido = "Nuevo empleado";
        this.edad = 10;
    }

    public Empleado(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarEmpleado() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado(1, "Juan", "Pérez", 30);
        Empleado empleado3 = new Empleado(2, "María", "González", 25);
        Empleado empleado4 = new Empleado(3, "Pedro", "Martínez", 40);

        empleado1.mostrarEmpleado();
        System.out.println("\n");
        empleado2.mostrarEmpleado();
        System.out.println("\n");
        empleado3.mostrarEmpleado();
        System.out.println("\n");
        empleado4.mostrarEmpleado();
    }
}
