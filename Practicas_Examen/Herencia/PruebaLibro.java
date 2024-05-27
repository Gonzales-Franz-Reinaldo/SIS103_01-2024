public class PruebaLibro {
    public static void main(String[] args) {
        // Instaciamos un nuevo objeto de la clase libro
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes");
        libro1.setPrecio(300);
        libro1.imprimir();
        System.out.println("=========================================");
        LibroTexto libroTexto1 = new LibroTexto("Álgebra Lineal", "Grossman", "Matemáticas");
        libroTexto1.setPrecio(500);
        libroTexto1.imprimir();
        System.out.println("=========================================");
        LibroTextoUniversidad libroTextoUni1 = new LibroTextoUniversidad("Programación en Java", "Deitel", "Programación", "Ingeniería de Sistemas");
        libroTextoUni1.setPrecio(700);
        libroTextoUni1.imprimir();
        System.out.println("=========================================");
        Novelas novela1 = new Novelas("El Quijote", "Miguel de Cervantes", "Novela de aventuras");
        novela1.setPrecio(400);
        novela1.imprimir();
    }
}
