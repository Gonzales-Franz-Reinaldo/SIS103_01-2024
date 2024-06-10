public class EmpleadoMedioTiempo extends Empleado {
    public EmpleadoMedioTiempo(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void calcularSalario() {
        // Podemos carcular el salario para empleados de medio tiempo
        double salario = getSalario();
        double salarioProporcional = salario / 2; 
        System.out.println("El salario de " + getNombre() + " de medio tiempo es: " + salarioProporcional);
    }
} 