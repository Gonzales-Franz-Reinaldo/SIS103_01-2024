// package Practicas_Examen.Sobrecarga_Metodos;

public class Suma {
    
    public void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es " + suma);
    }

    public void sumar(int a, int b, int c) {
        int suma = a + b + c;
        System.out.println("La suma de " + a + ", " + b + " y " + c + " es " + suma);
    }

    public void sumar(double a, double b) {
        double suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es " + suma);
    }

    public void sumar(double a, double b, double c) {
        double suma = a + b + c;
        System.out.println("La suma de " + a + ", " + b + " y " + c + " es " + suma);
    }

    public static void main(String[] args) {
        Suma suma = new Suma();

        suma.sumar(5, 7);
        suma.sumar(5, 7, 9);
        suma.sumar(5.5, 7.5);
        suma.sumar(5.5, 7.5, 9.5);
    }
}
