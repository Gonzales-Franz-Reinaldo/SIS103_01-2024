
public class Pelicula {

  // Atributo que define el nombre de la película
  private String nombre;
  // Atributo que define el director de la película
  private String director;

  // Tipo de película como un valor enumerado
  private enum tipo {
    ACCIÓN,
    COMEDIA,
    DRAMA,
    SUSPENSO,
  }

  // Atributo que define el tipo de película
  tipo genero;
  // Atributo que define la duracion de la película
  private int duracion;
  // Atributo que define el año de estreno de la película
  private int año;
  // Atributo que define la calificacion de la película por el público
  private double calificacion;

  /**
   * Constructor de la clase Pelicula
   * @param nombre Parámetro que define el nombre o título de la
   * película
   * @param director Parámetro que define el nombre completo del
   * director de la película
   * @param genero Parámetro que define el genero de la película
   * @param duracion Parámetro que define la duracion de una
   * película (en minutos)
   * @param año Parámetro que define el año de estreno de la película
   * @param calificacion Parámetro que define la calificacion de la
   * pelicula realizada por el público
   */

  public Pelicula(String nombre, String director, tipo genero, int duracion, int año, double calificacion) {
    this.nombre = nombre;
    this.director = director;
    this.genero = genero;
    this.duracion = duracion;
    this.año = año;
    this.calificacion = calificacion;
  }

  /**
   * Método que devuelve el nombre de una película
   * @return El nombre de una película
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Método que establece el nombre de una película
   * @param nombre Parámetro que define el nombre de una película
   */
  private void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Método que devuelve el director de una película
   * @return El director de una película
   */
  public String getDirector() {
    return director;
  }

  /**
   * Método que establece el director de una película
   * @param director Parámetro que define el director de una película
   */
  private void setDirector(String director) {
    this.director = director;
  }

  /**
   * Método que devuelve el genero de una película
   * @return El genero de una película
   */
  public tipo getGenero() {
    return genero;
  }

  /**
   * Método que establece el genero de una película
   * @param genero Parámetro que define el genero de una película
   */
  private void setGenero(tipo genero) {
    this.genero = genero;
  }

  /**
   * Método que devuelve la duracion de una película
   * @return La duracion de una película
   */
  public int getDuracion() {
    return duracion;
  }

  /**
   * Método que establece la duracion de una película
   * @param duracion Parámetro que define la duracion de una película
   */
  private void setDuración(int duracion) {
    this.duracion = duracion;
  }

  /**
   * Método que devuelve el año de una película
   * @return El año de estreno de una película
   */
  public int getAño() {
    return año;
  }

  /**
   * Método que establece el año de estreno de una película
   * @param año Parámetro que define el año de una película
   */

  private void setAño(int año) {
    this.año = año;
  }

  /**
   * Método que devuelve la calificacion de una película
   * @return La calificacion de una película
   */
  public double getCalificación() {
    return año;
  }

  /**
        * Método que establece la calificacion de una película
        * @param calificacion Parámetro que define la calificacion de una 
        película
        */
  private void setCalificación(double calificacion) {
    this.calificacion = calificacion;
  }

  /**
   * Método que imprime en pantalla los datos de una película
   */
  public void imprimir() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Director: " + director);
    System.out.println("Género: " + genero);
    System.out.println("Duración: " + duracion);
    System.out.println("Año: " + año);
    System.out.println("Calificación: " + calificacion);
  }

  /**
   * Método que determina si una película se puede considerar como épica
   * @return Valor booleano que determina si una película es épica o no
   */
  private boolean esPelículaEpica() {
    /* Una película se considera épica si tiene una duracion igual o 
        superior a 180 minutos */
    if (duracion >= 180) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Método que determina la valoración cualitativa de una película
   * @return Valoración de una película
   */
  private String calcularValoración() {
    if (calificacion >= 0 && calificacion <= 2) {/* Entre [0, 2] se considera “Muy mala” */
      return "Muy mala";

    } else if (calificacion > 2 && calificacion <= 5) {/* Entre (2, 5] se 
        considera “Mala” */
      return "Mala";

    } else if (calificacion > 5 && calificacion <= 7) {/* Entre (5,7] se 
        considera “Regular” */
      return "Regular";

    } else if (calificacion > 7 && calificacion <= 8) {/* Entre (7,8] se 
        considera “Buena” */
      return "Buena";

    } else if (calificacion > 8 && calificacion <= 10) {/* Entre (8,10] se 
        considera “Excelente” */
      return "Excelente";

    } else {
      return "No tiene asignada una valoración válida";
    }
  }

  /**
   * Método que determina si una película es similar a otra
   * @return Valor booleano que determina si una película es similar a
   * otra
   */
  private boolean esSimilar(Pelicula película) {
    /* Dos películas son similares si ambas son del mismo genero y si 
        tienen la misma valoración */
    if (película.genero == genero && película.calcularValoración() == calcularValoración()) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Método main que crea dos películas, imprime sus datos en
   * pantalla, determina si son épicas y si son similares
   */
  public static void main(String ags[]) {
    Pelicula película1 = new Pelicula("Gandhi", "Richard Attenborough", tipo.DRAMA, 191, 1982, 8.3);
    Pelicula película2 = new Pelicula("Thor", "Kenneth Branagh", tipo.ACCIÓN, 115, 2011, 7.0);
    
    película1.imprimir();
    System.out.println();
    película2.imprimir();
    System.out.println();

    System.out.println("La película " + película1.getNombre() + " es épica: " + película1.esPelículaEpica());

    System.out.println("La película " + película2.getNombre() + " es épica: " + película2.esPelículaEpica());

    System.out.println("La película " + película1.getNombre() + " y la película " + película2.getNombre() + " son similares = " + película1.esSimilar(película2));
  }
}
