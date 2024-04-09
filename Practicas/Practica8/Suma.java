public class Suma {

  public int sumar(int number1, int number2) {
    return number1 + number2;
  }

  public int sumar(int number1, int number2, int number3) {
    return number1 + number2 + number3;
  }

  public double sumar(double number1, double number2) {
    return number1 + number2;
  }

  public double sumar(double number1, double number2, double number3) {
    return number1 + number2 + number3;
  }

  public static void main(String[] args) {
    Suma suma = new Suma();
    System.out.println("La suma es: " + suma.sumar(5, 5));
    System.out.println("La suma es: " + suma.sumar(5, 5, 5));
    System.out.println("La suma es: " + suma.sumar(2.5, 2.5));
    System.out.println("La suma es: " + suma.sumar(2.5, 2.5, 2.5));
  }
}
