public class Fraccion extends Numerica {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }
        Fraccion fraccion = (Fraccion) objeto;
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {

        if (numero instanceof Fraccion){
            Fraccion fraccion = (Fraccion) numero;
            int numerador = this.numerador * fraccion.denominador + this.denominador * fraccion.numerador;
            int denominador = this.denominador * fraccion.denominador;
            return new Fraccion(numerador, denominador);
        } else {
            return null;
        }
    }

    @Override
    public Numerica restar(Numerica numero) {

        if (numero instanceof Fraccion){
            Fraccion fraccion = (Fraccion) numero;
            int numerador = this.numerador * fraccion.denominador - this.denominador * fraccion.numerador;
            int denominador = this.denominador * fraccion.denominador;
            return new Fraccion(numerador, denominador);
        } else {
            return null;
        }
    }

    @Override
    public Numerica multiplicar(Numerica numero) {

        if (numero instanceof Fraccion){
            Fraccion fraccion = (Fraccion) numero;
            int numerador = this.numerador * fraccion.numerador;
            int denominador = this.denominador * fraccion.denominador;
            return new Fraccion(numerador, denominador);
        } else {
            return null;
        }
    }

    @Override
    public Numerica dividir(Numerica numero) {

        if (numero instanceof Fraccion){
            Fraccion fraccion = (Fraccion) numero;
            int numerador = this.numerador * fraccion.denominador;
            int denominador = this.denominador * fraccion.numerador;
            return new Fraccion(numerador, denominador);
        } else {
            return null;
        }
    }
}