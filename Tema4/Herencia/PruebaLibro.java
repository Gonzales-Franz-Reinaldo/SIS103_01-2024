class Libro {
    
    // Declaramos los atributos del libro 
    protected String titulo;
    protected String autor;
    protected int precio;

    public Libro(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
    }


    // Metodos de get y set 
    String getTitulo( ){
        return titulo;
    }

    String getAutor( ){
        return autor;
    }

    int getPrecio(){
        return precio;
    }

    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    void setAutor(String autor){
        this.autor = autor;
    }

    void setPrecio(int precio){
        this.precio = precio;
    }


    public void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
    }
}



class LibroTexto extends Libro {

    private String cursoAsoc;

    public LibroTexto(String titulo, String autor, String cursoAsoc){
        super(titulo, autor);
        this.cursoAsoc = cursoAsoc;
    }

    // imprimir todos los datos respecto al padre Libro y el atributo cursoAsoc:
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Curso asociado: " + cursoAsoc);
    }
}

class LibroTextoUniversidad extends LibroTexto {

    private String facultad;

    public LibroTextoUniversidad(String titulo, String autor, String cursoAsoc, String facultad){
        super(titulo, autor, cursoAsoc);
        this.facultad = facultad;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Facultad: " + facultad);
    }
}




class Novelas extends Libro {

    private String tipoLibro;
    
    public Novelas(String titulo, String autor, String tipoLibro){
        super(titulo, autor);
        this.tipoLibro = tipoLibro;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de libro: " + tipoLibro);
    }
}



// Definimos la clase main 

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
