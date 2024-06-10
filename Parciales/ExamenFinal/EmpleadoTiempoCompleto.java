public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void calcularSalario() {
        // Podemos carcular el salario para empleados de tiempo completo
        double salario = getSalario();
        double salarioBonos = salario + 500; 
        System.out.println("El salario del empleado " + getNombre() + " de tiempo completo es: " + salarioBonos);
    }
}

