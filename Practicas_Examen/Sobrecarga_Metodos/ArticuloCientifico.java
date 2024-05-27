// package Practicas_Examen.Sobrecarga_Metodos;

public class ArticuloCientifico {
    String titulo;
    String autor;
    String [] palabrasClave = new String[3];
    String publicacion;
    int anio;
    String resumen;

    public ArticuloCientifico(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClave, String publicacion, int anio){
        this(titulo, autor);
        this.palabrasClave = palabrasClave;
        this.publicacion = publicacion;
        this.anio = anio;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClave, String publicacion, int anio, String resumen){
        this(titulo, autor, palabrasClave, publicacion, anio);
        this.resumen = resumen;
    }

    public void mostrarArticulo(){
        System.out.println("Título del Articulo" + " : " + titulo);
        System.out.println("Autor del Articulo" + " : " + autor);
        System.out.println("Palabra Clave:");

        for(String s : palabrasClave){
            System.out.println(s);
        }

        System.out.println("Publicación" + " : " + publicacion);
        System.out.println("Año de Publicación" + " : " + anio);
        System.out.println("Resumen del Articulo" + " : " + resumen);
    }

    public static void main(String[] args) {
        String[] palabrasClave = {"Física", "Espacio", "Tiempo"};

        ArticuloCientifico articulo = new ArticuloCientifico("La Teoría de la Relatividad", "Albert Einstein", palabrasClave, "La Revista de la Ciencia", 1905, "Las leyes de la fisica son las mismas en todos los sistemas de referencia inerciales.");

        articulo.mostrarArticulo();
    }
}
