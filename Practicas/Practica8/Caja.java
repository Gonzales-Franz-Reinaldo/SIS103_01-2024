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

    public Caja() {
        this.longitudBase = 0;
        this.ancho = 0;
        this.alto = 0;
    }

    public Caja(int longitudBase) {
        this.longitudBase = longitudBase;
        this.ancho = longitudBase;
        this.alto = longitudBase;
    }

    public Caja(int longitudBase, int ancho, int alto, String tipo) {
        this(longitudBase, ancho, alto);
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println("longitud de la Base = " + longitudBase);
        System.out.println("anchura = " + ancho);
        System.out.println("altura = " + alto);
        System.out.println("tipo = " + tipo);
    }

    public static void main(String[] args) {
        Caja caja1 = new Caja(1, 2, 3);
        Caja caja2 = new Caja();
        Caja caja3 = new Caja(1);
        Caja caja4 = new Caja(1, 2, 3, "Madera");
        caja1.imprimir();
        System.out.println();
        caja2.imprimir();
        System.out.println();
        caja3.imprimir();
        System.out.println();
        caja4.imprimir();
    }
}