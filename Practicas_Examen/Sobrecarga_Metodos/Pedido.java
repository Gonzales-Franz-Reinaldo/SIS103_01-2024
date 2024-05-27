// package Practicas Examen.Sobrecarga Metodos;

public class Pedido {
    
    public void calcularPedido(String primerPlato, double costoPrimerPlato, String bebida, double costoBebida){
        double total = costoPrimerPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + "y" + bebida + " es de " + total + "$");
    }

    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida){
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " y " + bebida + " es de " + total + "$");
    }
    
    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String postre, double costoPostre, String bebida, double costoBebida){
        double total = costoPrimerPlato + costoSegundoPlato + costoPostre + costoBebida;
        System.out.println("El costo de " + primerPlato + " , " + segundoPlato + ", " + postre + " y " + bebida + " es de " + total + "$");
    }

    public static void main(String[] args){
        Pedido pedido1 = new Pedido();
        pedido1.calcularPedido("Sancocho", 500, "Cerveza", 300);

        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Sancocho", 500, "Tortilla", 400, "Cerveza", 300);

        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido("Sancocho", 500, "Tortilla", 400, "Helado", 600, "Cerveza", 300);
    }
}
