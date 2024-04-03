
/**
 * Esta clase define objetos de tipo ConversorMetros el cual permite
 * realizar conversiones entre diferentes unidades de medición de longitud.
 * 
 * @version 1.2/2020
 */
public class ConversorMetros {
    /*
     * Atributo que define la cantidad de metros a convertir a diferentes
     * unidades de longitud
     */
    double metros;
    final int FACTOR_METROS_CM = 100; /*
                                       * Factor de conversión de
                                       * metros a centimetros
                                       */
    final int FACTOR_METROS_MILIM = 1000; /*
                                           * Factor de conversión
                                           * de metros a milimetros
                                           */
    final double FACTOR_METROS_PULGADAS = 39.37; /*
                                                  * Factor de
                                                  * conversión de metros a pulgadas
                                                  */
    final double FACTOR_METROS_PIES = 3.28; /*
                                             * Factor de
                                             * conversión de metros a pies
                                             */
    final double FACTOR_METROS_YARDAS = 1.09361; /*
                                                  * Factor de
                                                  * conversión de metros a yardas
                                                  */

    /**
     * Constructor de la clase ConversorMetros
     * 
     * @param metros Parámetro que define la cantidad de metros a
     *               convertir a otras unidades de longitud
     */
    public ConversorMetros(double metros) {
        this.metros = metros;
    }

    /**
     * Método que convierte metros a centimetros
     * 
     * @return Resultado de la conversión de metros a centimetros
     */
    public double convertirMetrosToCentimetros() {
        double centimetros;
        centimetros = FACTOR_METROS_CM * metros;
        return centimetros;
    }

    /**
     * Método que convierte metros a milimetros
     * 
     * @return Resultado de la conversión de metros a milimetros
     */
    public double convertirMetrosToMilímetros() {
        double milimetros;
        milimetros = FACTOR_METROS_MILIM * metros;
        return milimetros;
    }

    /**
     * Método que convierte metros a pulgadas
     * 
     * @return Resultado de la conversión de metros a pulgadas
     */
    public double convertirMetrosToPulgadas() {
        double pulgadas;
        pulgadas = FACTOR_METROS_PULGADAS * metros;
        return pulgadas;
    }

    /**
     * Método que convierte metros a pies
     * 
     * @return Resultado de la conversión de metros a pies
     */
    public double convertirMetrosToPies() {
        double pies;
        pies = FACTOR_METROS_PIES * metros;
        return pies;
    }

    /**
     * Método que convierte metros a yardas
     * 
     * @return Resultado de la conversión de metros a yardas
     */
    public double convertirMetrosToYardas() {
        double yardas;
        yardas = FACTOR_METROS_YARDAS * metros;
        return yardas;
    }

    /**
* Método main que define una cierta cantidad de metros y los 
* convierte a diferentes unidades de longitud
*/
    public static void main (String args[]) {
    
        ConversorMetros conversor = new ConversorMetros(3.5);
        
        System.out.println("Metros = " + conversor.metros);
        System.out.println("Metros a centimetros = " + conversor.convertirMetrosToCentimetros());
        System.out.println("Metros a milimetros = " + conversor.convertirMetrosToMilímetros());
        System.out.println("Metros a pulgadas = " + conversor.convertirMetrosToPulgadas());
        System.out.println("Metros a pies = " + conversor.convertirMetrosToPies());
        System.out.println("Metros a yardas = " + conversor.convertirMetrosToYardas());
    }
}