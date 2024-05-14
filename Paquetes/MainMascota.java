// Clase raíz para todos los animales
class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;

    // Constructor de la clase Mascota
    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
}

// Clase para perros
class Perro extends Mascota {
    protected double peso;
    protected boolean muerde;

    // Constructor de la clase Perro
    public Perro(String nombre, int edad, String color, double peso,
            boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    // Método estático para sonido de perros
    public static void sonido() {
        System.out.println("Los perros ladran");
    }
}

// Clase para gatos
class Gato extends Mascota {
    protected double alturaSalto;
    protected double longitudSalto;

    // Constructor de la clase Gato
    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    // Método estático para sonido de gatos
    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }
}

// Clases para razas específicas de perros
class PerroPequeno extends Perro {
    // Constructor de la clase PerroPequeno
    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }
}

class PerroMediano extends Perro {
    // Constructor de la clase PerroMediano
    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }
}

class PerroGrande extends Perro {
    // Constructor de la clase PerroGrande
    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }
}

// Clases para razas específicas de gatos
class GatoSinPelo extends Gato {
    // Constructor de la clase GatoSinPelo
    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}

class GatoPeloLargo extends Gato {
    // Constructor de la clase GatoPeloLargo
    public GatoPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}

class GatoPeloCorto extends Gato {
    // Constructor de la clase GatoPeloCorto
    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}

public class MainMascota {
    
    public static void main(String[] args) {
        // Crear un perro
        Perro perro = new Perro("Fido", 3, "Marrón", 8.5, false);
        System.out.println("Datos del perro:");
        System.out.println("Nombre: " + perro.nombre);
        System.out.println("Edad: " + perro.edad);
        System.out.println("Color: " + perro.color);
        System.out.println("Peso: " + perro.peso);
        System.out.println("¿Muerde?: " + perro.muerde);
        Perro.sonido(); // Llamar al método estático de la clase Perro para hacer sonido
        System.out.println(); // Espacio en blanco para separar perro y gato
        // Crear un gato
        Gato gato = new Gato("Whiskers", 2, "Blanco", 1.5, 2.0);
        System.out.println("Datos del gato:");
        System.out.println("Nombre: " + gato.nombre);
        System.out.println("Edad: " + gato.edad);
        System.out.println("Color: " + gato.color);
        System.out.println("Altura de salto: " + gato.alturaSalto);
        System.out.println("Longitud de salto: " + gato.longitudSalto);
        Gato.sonido(); // Llamar al método estático de la clase Gato para hacer sonido
    }
}