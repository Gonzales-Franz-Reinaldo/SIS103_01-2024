public class ArticuloCientifico {
    String titulo;
    String autor;
    String[] palabrasClave = new String[3];
    String publicacion;
    int ano;
    String resumen;

    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClave,
            String publicacion, int ano) {
        this(titulo, autor);
        this.palabrasClave = palabrasClave;
        this.publicacion = publicacion;
        this.ano = ano;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClave,
            String publicacion, int ano, String resumen) {
        this(titulo, autor, palabrasClave, publicacion, ano);
        this.resumen = resumen;
    }

    public void imprimir() {
        System.out.println("Título del Artículo = " + titulo);
        System.out.println("Autor del Artículo = " + autor);
        System.out.println("Palabras clave:");
        for (String s : palabrasClave) {
            System.out.println(s);
        }
        System.out.println("Publicacion = " + publicacion);
        System.out.println("Año = " + ano);
        System.out.println("Resumen = " + resumen);
    }

    public static void main (String[] args) {
        String[] palabrasClave = {"Fisica","Espacio","Tiempo"};
        ArticuloCientifico articulo = new ArticuloCientifico("La Teoria Especial de la Relatividad", "Albert Einstein", palabrasClave, "Anales de Fisica", 1913, "Las leyes de la fisica son las mismas en todos los sistemas de referencia inerciales.");
        articulo.imprimir();
    }
}
