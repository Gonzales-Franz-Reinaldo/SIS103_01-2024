package Inmuebles;

/**
 * Esta clase denominada Local modela un tipo específico de inmueble
 * que no esta destinado para la vivienda que tiene como atributos un
 * tipo que especifica si es un local interno o que da a la calle.
 * 
 * @version 1.2/2020
 */
public class Local extends Inmueble {

    enum tipo {
        INTERNO, CALLE
    }; /*
        * Tipo de inmueble especificado
        * como un valor enumerado
        */

    protected tipo tipoLocal; /*
                               * Atributo que identifica el tipo de
                               * inmueble
                               */

    /**
     * Constructor de la clase Local
     * 
     * @param identificadorInmobiliario Parametro que define el
     *                                  identificador inmobiliario de un local
     * @param area                      Parametro que define el area de un local
     * @param direccion                 Parametro que define la direccion donde se
     *                                  encuentra localizado un local
     * @param tipoLocal                 Parametro que define el tipo de local
     *                                  (interno o
     *                                  que da a la calle)
     */
    public Local(int identificadorInmobiliario, int area, String direccion,
            tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    /**
    * Método que muestra en pantalla los datos de un local
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
    }
}