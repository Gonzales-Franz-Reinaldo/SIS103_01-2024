public abstract class Numerica {

    // Convierte el número a String
    public abstract String toString();

    // Compara si dos objetos son iguales, con el parámetro
    public abstract boolean equals(Object obj);

    // Retorna la suma de dos números
    public abstract Numerica sumar(Numerica numero);

    // Retorna la resta de dos números
    public abstract Numerica restar(Numerica numero);

    // Retorna el producto de dos números
    public abstract Numerica multiplicar(Numerica numero);

    // Retorna la división de dos números
    public abstract Numerica dividir(Numerica numero);
}
