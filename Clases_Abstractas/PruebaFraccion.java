public class PruebaFraccion {
    
    public static void main(String[] args) {
        
        Fraccion fraccion1 = new Fraccion(3, 7);
        Fraccion fraccion2 = new Fraccion(4, 5);
        
        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        
        System.out.println("Suma: " + fraccion1.sumar(fraccion2));
        System.out.println("Resta: " + fraccion1.restar(fraccion2));
        System.out.println("Multiplicación: " + fraccion1.multiplicar(fraccion2));
        System.out.println("División: " + fraccion1.dividir(fraccion2));

        if (fraccion1.equals(fraccion2)) {
            System.out.println("Las fracciones son iguales");
        } else {
            System.out.println("Las fracciones no son iguales");
        }

        String toString = fraccion1.toString();
        
        if (toString.equals("3/7")) {
            System.out.println("El toString de la fracción 1 es correcto");
        } else {
            System.out.println("El toString de la fracción 1 no es correcto");
        }

    }
}
