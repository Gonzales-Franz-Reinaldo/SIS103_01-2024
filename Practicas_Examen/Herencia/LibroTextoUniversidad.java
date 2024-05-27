public class LibroTextoUniversidad extends LibroTexto {
    private String facultad;

    public LibroTextoUniversidad(String titulo, String autor, String cursoAsoc,
            String facultad) {
        super(titulo, autor, cursoAsoc);
        this.facultad = facultad;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Facultad: " + facultad);
    }
}