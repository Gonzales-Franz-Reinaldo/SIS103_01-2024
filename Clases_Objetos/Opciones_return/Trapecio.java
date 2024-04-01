public class Trapecio {
    
    // Inicializamos las variable 
    private double baseMenor;
    private double baseMayor;
    private double altura;

    private double lado1;
    private double lado2;

    public Trapecio(double baseMenor, double baseMayor, double altura, double lado1, double lado2) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodos de calculo:

    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double calcularPerimetro() {
        return baseMenor + baseMayor + lado1 + lado2;
    }


    public static void main(String[] args) {
        Trapecio trapecio = new Trapecio(5, 10, 5, 5, 5);

        double area = trapecio.calcularArea();
        double perimetro = trapecio.calcularPerimetro();

        System.out.println("El área del trapecio es: " + Math.round(area));
        System.out.println("El perímetro del trapecio es: " + Math.round(perimetro));
    }
}
