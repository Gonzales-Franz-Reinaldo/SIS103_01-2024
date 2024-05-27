public class LibroTexto extends Libro {
    private String cursoAsoc;

    public LibroTexto(String titulo, String autor, String cursoAsoc) {
        super(titulo, autor);
        this.cursoAsoc = cursoAsoc;
    }

    // imprimir todos los datos respecto al padre Libro y el atributo cursoAsoc:
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso asociado: " + cursoAsoc);
    }
}