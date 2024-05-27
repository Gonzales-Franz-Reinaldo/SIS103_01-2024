
public class PruebaSeleccionFutbol {
    
    public static void main(String[] args) {

        SeleccionFutbol seleccionFutbol = new SeleccionFutbol(1, "Carlos", "Torrez", 30);

        Futbolista futbolista = new Futbolista(1, "Juan", "Perez", 22, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Alejandro", "Chavez", 45, "Licenciado en Educacion Fisica");
        Masajista masajista = new Masajista(3, "Mario", "Lopez", 35, "Licenciado en Fisioterapia", 10);

        System.out.println("======= Seleccción de Fútbol ===========");
        seleccionFutbol.Concentrarse();
        seleccionFutbol.Viajar();
        System.out.println();
        
        System.out.println("======= Futbolista ===========");
        futbolista.presentarse();
        futbolista.JugarPartido();
        futbolista.Entrenar();
        System.out.println();
        
        System.out.println("======= Entrenador ===========");
        entrenador.presentarse();
        entrenador.DirigirPartido();
        entrenador.DirigirEntrenamiento();
        System.out.println();
        
        System.out.println("======= Masajista ===========");
        masajista.presentarse();
        masajista.darMasaje();
    }
}
