
/**
 * Esta clase abstracta denominada Animal modela un animal genérico
 * que cuenta con atributos como un sonido, alimentos que consume,
 * un haabitat y un nombre científico.
 * 
 * @version 1.2/2020
 */
public abstract class Animal {
    protected String sonido; /*
                              * Atributo que identifica el sonido emitido
                              * por un animal
                              */
    protected String alimentos; /*
                                 * Atributo que identifica los alimentos
                                 * que consume un animal
                                 */
    protected String haabitat; /*
                               * Atributo que identifica el haabitat de un
                               * animal
                               */
    protected String nombreCientifico; /*
                                        * Atributo que identifica el
                                        * nombre científico de un animal
                                        */

    /**
     * Método abstracto que permite obtener el nombre científico del animal
     * 
     * @return El nombre científico del animal
     */

    public abstract String getNombreCientifico();

    /**
     * Método abstracto que permite obtener el sonido producido por el
     * animal
     * 
     * @return El sonido producido por el animal
     */
    public abstract String getSonido();

    /**
     * Método abstracto que permite obtener los alimentos que consume
     * un animal
     * 
     * @return Los alimentos que consume el animal
     */
    public abstract String getAlimentos();

    /**
     * Método abstracto que permite obtener el haabitat de un animal
     * 
     * @return El haabitat del animal
     */
    public abstract String getHaabitat();
}


