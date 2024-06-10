public abstract class Empleado {


    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario() {

        System.out.println("El salario de " + nombre + " es: " + salario);
    }

    public void despedir() {
        System.out.println("El empleado " + nombre + " ha sido despedido.");
    }

    public void promocion(double incremento) {
        salario += incremento;
        System.out.println("El empleado " + nombre + " ha sido promovido  nuevo salario de: " + salario);
    }

    public void alta() {
        System.out.println("El empleado " + nombre + " ha sido dado de alta en la empresa.");
    }

    public void jubilar() {
        System.out.println("El empleado " + nombre + " se ha jubilado.");
    }
}
