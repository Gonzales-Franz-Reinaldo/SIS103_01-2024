
//? Hacer un programa que calcule las raíces de una ecuación cuadrática
public class EcuacionCuadratica{

    public static void main(String[] args) {
        
        double a = 1;
        double b = 3;
        double c = -4;

        double discriminante = b * b - 4 * a * c;
        
        double x1, x2;

        if(discriminante > 0){
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las raíces de la ecuación cuadrática son: ");
            System.out.println("El valor de x1 es: " + x1);
            System.out.println("El valor de x2 es: " + x2);
        }else{
            if(discriminante == 0){
                x1 = x2 = -b / (2 * a);
                System.out.println("Las ecuación tiene una raíz real: ");
                System.out.println("El valor de x1 es: " + x1);
                System.out.println("El valor de x2 es: " + x2);
            }else{
                if(discriminante < 0){
                    double parteReal = -b / (2 * a);
                    double prateImaginaria = Math.sqrt(-discriminante) / (2 * a);
                    System.out.println("Las raíces son complejas: ");
                    System.out.println("El valor de x1 es: " + parteReal + " + " + prateImaginaria + "i");
                    System.out.println("El valor de x2 es: " + parteReal + " - " + prateImaginaria + "i");
                }
            }
        }
    }
}