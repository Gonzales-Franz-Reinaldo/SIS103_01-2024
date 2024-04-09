public class Empleado {
    int id;
    String nombre;
    String apellido;
    int edad;

    public Empleado() {
        this.id = 100;
        this.nombre = "Nuevo Empleado";
        this.apellido = "Nuevo Empleado";
        this.edad = 18;
    }

    public Empleado(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("edad = " + edad);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado(1012, "Franz Reinaldo", "Gonzales", 21);
        empleado1.imprimir();
        System.out.println();
        empleado2.imprimir();
    }
}