public class Novelas extends Libro {
    private String tipoLibro;

    public Novelas(String titulo, String autor, String tipoLibro) {
        super(titulo, autor);
        this.tipoLibro = tipoLibro;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de libro: " + tipoLibro);
    }
}
