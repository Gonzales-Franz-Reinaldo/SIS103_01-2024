// package Practicas_Examen.Sobrecarga_Metodos;

public class Caja {
    int longitudBase;
    int ancho;
    int alto;
    String tipo;

    public Caja(int longitudBase, int ancho, int alto) {
        this.longitudBase = longitudBase;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Caja(){
        this.longitudBase = 0;
        this.ancho = 0;
        this.alto = 0;
    }

    public Caja(int longitudBase){
        this.longitudBase = longitudBase;
        this.ancho = longitudBase;
        this.alto = longitudBase;
    }

    public Caja(int longitudBase, int ancho, int alto, String tipo) {
        this(longitudBase, ancho, alto);
        this.tipo = tipo;
    }

    public void mostrarCaja() {
        System.out.println("Longitud base: " + longitudBase);
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Tipo: " + tipo);
    }

    public static void main(String[] args) {
        Caja caja1 = new Caja(1, 2, 4);
        Caja caja2 = new Caja();
        Caja caja3 = new Caja(1);
        Caja caja4 = new Caja(1, 2, 3, "Caja de madera");

        caja1.mostrarCaja();
        System.out.println();
        caja2.mostrarCaja();
        System.out.println();
        caja3.mostrarCaja();
        System.out.println();
        caja4.mostrarCaja();
    }
}
