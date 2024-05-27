// package Practicas_Examen.Herencia;

public class Libro {
    // Declaramos los atributos del libro
    protected String titulo;
    protected String autor;
    protected int precio;

    public Libro(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
    }

    // Metodos de get y set
    String getTitulo() {
        return titulo;
    }

    String getAutor() {
        return autor;
    }

    int getPrecio() {
        return precio;
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    void setPrecio(int precio) {
        this.precio = precio;
    }

    public void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
    }
}
