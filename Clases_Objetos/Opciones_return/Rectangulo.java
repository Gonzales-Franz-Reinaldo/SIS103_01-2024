/**
 * Esta clase define objetos de tipo Rectángulo con una base y una
 * altura como atributos.
 * @version 1.2/2020
 */
public class Rectangulo {

  int base; // Atributo que define la base de un rectángulo
  int altura; // Atributo que define la altura de un rectángulo

  /**
   * Constructor de la clase Rectangulo
   * @param base Parámetro que define la base de un rectángulo
   * @param altura Parámetro que define la altura de un rectángulo
   */
  Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
  }

  /**
   * Método que calcula y devuelve el área de un rectángulo como la
   * multiplicación de la base por la altura
   * @return Área de un rectángulo
   */
  double calcularArea() {
    return base * altura;
  }

  /**
   * Método que calcula y devuelve el perímetro de un rectángulo
   * como (2 * base) + (2 * altura)
   * @return Perímetro de un rectángulo
   */
  double calcularPerímetro() {
    return (2 * base) + (2 * altura);
  }


  public static void main(String[] args) {

    Rectangulo rectangulo = new Rectangulo(5, 10);

    double area = rectangulo.calcularArea();
    double perimetro = rectangulo.calcularPerímetro();

    System.out.println("El tamaño del rectángulo es: " + Math.round(area));
    System.out.println("El perímetro del rectángulo es: " + Math.round(perimetro));
  }
}
