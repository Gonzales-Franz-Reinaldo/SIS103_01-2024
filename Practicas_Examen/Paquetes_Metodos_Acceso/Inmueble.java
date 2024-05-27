// package Practicas_Examen.Paquetes_Metodos_Acceso;


public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area; 
    protected String dirección; 
    protected double precioVenta;


    Inmueble(int identificadorInmobiliario, int area, String dirección) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.dirección = dirección;
    }

    double calcularPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }

    void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Area = " + area);
        System.out.println("Dirección = " + dirección);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}