/**
 * Esta clase define objetos de tipo Avion con un fabricante y número de
 * motores como atributos.
 * 
 * @version 1.2/2020
 */
public class Avion {
    private String fabricante; /* Atributo que define el nombre del fabricante del avion */
    private int numeroMotores; /* Atributo que define el número de motores del avion */

    /**
     * Constructor de la clase Avion
     * 
     * @param fabricante    Parámetro que define el nombre del fabricante
     *                      de un avion
     * @param numeroMotores Parámetro que define el número de
     *                      motores que tiene un avion
     */
    private Avion(String fabricante, int numeroMotores) {
        this.fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }

    /**
     * Método que devuelve el nombre del fabricante de un avion
     * 
     * @return El nombre del fabricante de un avion
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Método que establece el nombre de un fabricande de un avion
     * 
     * @param fabricante Parámetro que define el nombre del fabricante
     *                   de un avion
     */
    private void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
    * Método que cambia el fabricante de un avion pasado como 
    * parámetro por el valor “Lockheed”
    * @param a Parámetro que define un avion
    */
    private void cambiarFabricante(Avion a) {
        a.setFabricante("Lockheed");
    }

    /**
     * Método que devuelve el número de motores de un avion
     * 
     * @return El número de motores de un avion
     */
    public int getNumeroMotores() {
        return numeroMotores;
    }

    /**
     * Método que establece el número de motores de un avion
     * 
     * @param numeroMotores Parámetro que define el número de
     *                      motores de un avion
     */
    private void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    /**
    * Método que imprime en pantalla el fabricante de un avion
    */
    public void imprimirFabricante() {
        System.out.println("El fabricante del avion es: " + fabricante);
    }

    /**
    * Método main que crea dos aviones y modifica sus fabricantes
    */
    public static void main(String args[]) {
        Avion a1 = new Avion("Airbu", 4);
        Avion a2;
        Avion a3 = new Avion("Boeing", 4);
        a2 = a1;

        Avion a4 = new Avion("Aerosur", 5);
        Avion a5;
        a5 = a4;

        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();

        a4.imprimirFabricante();
        a5.imprimirFabricante();

        a5.setFabricante("Stealth");
        a4.imprimirFabricante();
    }
}
