/**
* Esta clase denominada DispositivoInformatico modela un equipo 
* informático y cuenta con un único atributo: marca, el cual 
* inicialmente tiene el valor “Acer”.
* @version 1.2/2020
*/
class DispositivoInformatico {
    String marca = "Acer"; /* Atributo que identifica la marca del 
    dispositivo informático */
    /**
    * Constructor de la clase DispositivoInformatico que imprime en 
    * pantalla la marca del dispositivo informático
    */
    DispositivoInformatico() {
        System.out.println("Marca = " + marca);
    }
}


/**
* Esta clase denominada Tableta modela un tipo específico de equipo 
* informático
* @version 1.2/2020
*/
class Tableta extends DispositivoInformatico {
    /**
    * Constructor de la clase Tableta que imprime en pantalla la marca 
    * de la tableta
    */
    Tableta(String marca) {
        System.out.println("Marca = " + marca); /* ¿Qué imprimirá al ser 
        ejecutado el constructor? */
    }
}



/**
* Esta clase prueba las clase Tableta instanciando un objeto de esta clase
* @version 1.2/2020
*/
class Prueba {
    /**
    * Método main que crea una tableta con el parámetro “Dell”. ¿Qué 
    * se imprimirá en pantalla cuando se invoque al constructor de la clase? 
    * Tener en cuenta que Tableta es una subclase de DispositivoInformático
    */
    public static void main(String[] args) {
        Tableta tableta = new Tableta("Dell");
    }
}
