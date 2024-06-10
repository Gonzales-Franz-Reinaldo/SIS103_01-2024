public class Empresa {
    public static void main(String[] args) {

        Empleado empleado1 = new EmpleadoTiempoCompleto("Ramiro", 30, 2200);
        Empleado empleado2 = new EmpleadoMedioTiempo("Carlos", 25, 5000);

        // Damos de alta a los empleados 
        empleado1.alta();
        empleado2.alta();

        // Calculamos los salarios de los empleados
        empleado1.calcularSalario();
        empleado2.calcularSalario();

        // Promociones de los empleados
        empleado1.promocion(300);
        empleado2.promocion(150);

        // Calculamos los salarios de los empleados
        empleado1.calcularSalario();
        empleado2.calcularSalario();

        // Despedimos y jubilamos a los empleados
        empleado1.despedir();
        empleado2.jubilar();
    }
}

