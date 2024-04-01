/**
 * Esta clase define objetos de tipo Círculo con su radio como atributo.
 * @version 1.2/2020
 */
public class Circulo {

  int radio; // Atributo que define el radio de un círculo

  /**
   * Constructor de la clase Círculo
   * @param radio Parámetro que define el radio de un círculo
   */
  Circulo(int radio) {
    this.radio = radio;
  }

  /**
   * Método que calcula y devuelve el área de un círculo como pi
   * multiplicado por el radio al cuadrado
   * @return Área de un círculo
   */
  double calcularArea() {
    return Math.PI * Math.pow(radio, 2);
  }

  /**
   * Método que calcula y devuelve el perímetro de un círculo como la
   * multiplicación de pi por el radio por 2
   * @return Perímetro de un círculo
   */
  double calcularPerímetro() {
    return 2 * Math.PI * radio;
  }

  public static void main(String[] args) {
    Circulo circulo = new Circulo(5);

    double area = circulo.calcularArea();
    double perimetro = circulo.calcularPerímetro();

    System.out.println("El área del círculo es: " + Math.round(area));
    System.out.println("El perímetro del círculo es: " + Math.round(perimetro));
  }

}


