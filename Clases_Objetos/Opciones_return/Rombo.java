public class Rombo {
    
    // Inicializamos las variables de entrada calcular el area
    int base;
    int altura;

    // variables para el perímetro 
    int lado;

    public Rombo(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    double calcularArea(){
        return (base * altura) / 2;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }

    public static void main(String[] args) {
        Rombo rombo = new Rombo(5, 10, 5);

        double area = rombo.calcularArea();
        double perimetro = rombo.calcularPerimetro();

        System.out.println("El área del rombo es: " + Math.round(area));
        System.out.println("El perímetro del rombo es: " + Math.round(perimetro));
    }
}
