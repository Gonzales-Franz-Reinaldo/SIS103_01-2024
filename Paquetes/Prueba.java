class Inmueble {
    // Atributo para el identificador inmobiliario de un inmueble
    protected int identificadorInmobiliario;
    protected int area; // Atributo que identifica el area de un inmueble
    protected String direccion; /* Atributo que identifica la direccion 
    de un inmueble */
    protected double precioVenta; /* Atributo que identifica el precio de 
    venta de un inmueble */
    /**
    * Constructor de la clase Inmueble
    * @param identificadorInmobiliario Parametro que define el 
    identificador de un inmueble
    * @param area Parametro que define el area de un inmueble
    * @param direccion Parametro que define la direccion donde se 
    encuentra localizado un inmueble
    */
    public Inmueble(int identificadorInmobiliario, int area, String
    direccion) {
    this.identificadorInmobiliario = identificadorInmobiliario;
    this.area = area;
    this.direccion = direccion;
    }
    /**
    * Metodo que a partir del valor del area de un inmueble, calcula su 
    precio de venta
    * @param valorArea El valor unitario por area de un determinado 
    inmueble
    * @return Precio de venta del inmueble
    */
    double calcularPrecioVenta(double valorArea) {
    precioVenta = area * valorArea;
    return precioVenta;
    }
    /**
    * Metodo que muestra en pantalla los datos de un inmueble
    */
    void imprimir() {
    System.out.println("Identificador inmobiliario = " +
    identificadorInmobiliario);
    System.out.println("Area = " + area);
    System.out.println("Direccion = " + direccion);
    System.out.println("Precio de venta = $" + precioVenta);
    }
    }
    class InmuebleVivienda extends Inmueble {
    /* Atributo que identifica el numero de habitacion de un inmueble 
    para vivienda */
    protected int numeroHabitaciones;
    /* Atributo que identifica el numero de banos de un inmueble para 
    vivienda */
    protected int numeroBanos;
    /**
    * Constructor de la clase InmuebleVivienda
    * @param identificadorInmobiliario Parametro que define el 
    identificador inmobiliario de un inmueble para la vivienda
    * @param area Parametro que define el area de un inmueble para la 
    vivienda
    * @param direccion Parametro que define la direccion donde se 
    encuentra localizado un inmueble para la vivienda
    * @param numeroHabitaciones Parametro que define el numero de 
    habitaciones que tiene un inmueble para la vivienda
    * @param numeroBanos Parametro que define el numero de banos que 
    tiene un inmueble para la vivienda
    */
    public InmuebleVivienda(int identificadorInmobiliario, int area, 
    String direccion, int numeroHabitaciones, int numeroBanos) {
    super(identificadorInmobiliario, area, direccion); /* Invoca al 
    constructor de la clase padre */
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBanos = numeroBanos;
    }
    /**
    * Metodo que muestra en pantalla los datos de un inmueble para la 
    vivienda
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println("Numero de habitaciones = " +
    numeroHabitaciones);
    System.out.println("Numero de banos = " + numeroBanos);
    }
    }
    class Casa extends InmuebleVivienda {
    protected int numeroPisos; /* Atributo que identica el numero de 
    pisos que tiene una casa */
    /**
    * Constructor de la clase Casa
    * @param identificadorInmobiliario Parametro que define el 
    identificador inmobiliario de una casa
    * @param area Parametro que define el area de una casa
    * @param direccion Parametro que define la direccion donde se 
    encuentra localizada una casa
    * @param numeroHabitaciones Parametro que define el numero de 
    habitaciones que tiene una casa
    * @param numeroBanos Parametro que define el numero de banos que 
    tiene una casa
    * @param numeroPisos Parametro que define el numero de pisos que 
    tiene una casa
    */
    public Casa(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBanos);
    this.numeroPisos = numeroPisos;
    }
    /**
    * Metodo que muestra en pantalla los datos de una casa
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println("Numero de pisos = " + numeroPisos);
    }
    }
    class Apartamento extends InmuebleVivienda {
    /**
    * Constructor de la clase Apartamento
    * @param identificadorInmobiliario Parametro que define el 
    identificador inmobiliario de un apartamento
    * @param area Parametro que define el area de un apartamento
    * @param direccion Parametro que define la direccion donde se 
    encuentra localizado un apartamento
    * @param numeroHabitaciones Parametro que define el numero de 
    habitaciones que tiene un apartamento
    * @param numeroBanos Parametro que define el numero de banos que 
    tiene un apartamento
    */
    public Apartamento(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBanos);
    }
    /**
    * Metodo que muestra en pantalla los datos de un apartamento
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    }
    }
    class CasaRural extends Casa {
    // Atributo que identifica la distancia a la que se encuentra la casa 
    rural de la cabecera municipal
    protected int distanciaCabecera;
    // Atributo que identifica la altitud a la que se encuentra una casa 
    rural
    protected int altitud;
    /**
    * Constructor de la clase CasaRural
    * @param identificadorInmobiliario Parametro que define el 
    identificador inmobiliario de una casa rural
    * @param area Parametro que define el area de una casa rural
    * @param direccion Parametro que define la direccion donde se 
    encuentra localizada una casa rural
    * @param numeroHabitaciones Parametro que define el numero de 
    habitaciones que tiene una casa rural
    * @param numeroBanos Parametro que define el numero de banos que 
    tiene una casa rural
    * @param numeroPisos Parametro que define el numero de pisos que 
    tiene una casa rural
    * @param distanciaCabecera Parametro que define la distancia de la 
    casa rural a la cabecera municipal
    * @param altitud Parametro que define la altitud sobre el nivel del 
    mar en que se encuentra una casa rural
    */
    public CasaRural(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, int
    distanciaCabecera, int altitud) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBanos, numeroPisos);
    this.distanciaCabecera = distanciaCabecera;
    this.altitud = altitud;
    }
    /**
    * Metodo que muestra en pantalla los datos de una casa rural
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println("Distancia la cabecera municipal = " +
    distanciaCabecera + " km.");
    System.out.println("Altitud sobre el nivel del mar = " + altitud
    + " metros.");
    System.out.println();
    }
    }
    class CasaUrbana extends Casa {
    /**
    * Constructor de la clase CasaUrbana
    * @param identificadorInmobiliario Parametro que define el 
    identificador inmobiliario de una casa urbana
    * @param area Parametro que define el area de una casa urbana
    * @param direccion Parametro que define la direccion donde se 
    encuentra localizada una casa urbana
    * @param numeroHabitaciones Parametro que define el numero de 
    habitaciones que tiene una casa urbana
    * @param numeroBanos Parametro que define el numero de banos que
    tiene una casa urbana
    * @param numeroPisos Parametro que define el numero de pisos que 
    tiene una casa urbana
    */
    public CasaUrbana(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBanos, numeroPisos);
    }
    /**
    * Metodo que muestra en pantalla los datos de una casa urbana
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    }
    }
    class ApartamentoFamiliar extends Apartamento {
    // Atributo que identifica el valor de la administracion de un 
    apartamento familiar
    protected int valorAdministracion;
    // Atributo que identifica el valor por área de un apartamento 
    familiar
    protected static double valorArea;
    /**
    * Constructor de la clase ApartamentoFamiliar
    * @param identificadorInmobiliario Parametro que define el 
    identificador inmobiliario de un apartamento familiar
    * @param area Parametro que define el area de un apartamento familiar
    * @param direccion Parametro que define la direccion donde se 
    encuentra localizado un apartamento familiar
    * @param numeroHabitaciones Parametro que define el numero de 
    habitaciones que tiene un apartamento familiar
    * @param numeroBanos Parametro que define el numero de banos que 
    tiene un apartamento familiar
    * @param valorAdministracion Parametro que define el valor de la 
    administracion de un apartamento familiar
    */
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, 
    String direccion, int numeroHabitaciones, int numeroBanos, int
    valorAdministracion) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBanos);
    this.valorAdministracion = valorAdministracion;
    this.valorArea = valorArea;
    }
    /**
    * Metodo que muestra en pantalla los datos de un apartamento familiar
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println("Valor de la administracion = $" +
    valorAdministracion);
    System.out.println();
    }
    }
    class Apartaestudio extends Apartamento {
    // Atributo que identifica el valor por area de un apartaestudio
    protected static double valorArea = 1500000;
    /**
    * Constructor de la clase Apartaestudio
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de un apartaestudio
    * @param area Parametro que define el area de un apartaestudio
    * @param direccion Parametro que define la direccion donde se
    * encuentra localizado un apartaestudio
    * @param numeroHabitaciones Parametro que define el numero de
    * habitaciones que tiene un apartaestudio
    * @param numeroBanos Parametro que define el numero de banos
    * que tiene un apartaestudio
    */
    public Apartaestudio(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos) {
    // Invoca al constructor de la clase padre
    // Los apartaestudios tienen una sola habitacion y un solo bano
    super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    /**
    * Metodo que muestra en pantalla los datos de un apartaestudio
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println();
    }
    }
    class CasaConjuntoCerrado extends CasaUrbana {
    // Atributo que define el valor por area de una casa en conjunto 
    cerrado
    protected static double valorArea = 2500000;
    // Atributo que define el valor de administracion de una casa en 
    conjunto cerrado
    protected int valorAdministracion;
    // Atributo que define si una casa en conjunto cerrado tiene piscina
    protected boolean tienePiscina;
    // Atributo que define si una casa en conjunto cerrado tiene campos 
    deportivos
    protected boolean tieneCamposDeportivos;
    /**
    * Constructor de la clase CasaConjuntoCerrado
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de una casa en conjunto cerrado
    * @param area Parametro que define el area de una casa en conjunto
    * cerrado
    * @param direccion Parametro que define la direccion donde se
    * encuentra localizada una casa en conjunto cerrado
    * @param numeroHabitaciones Parametro que define el numero de
    * habitaciones que tiene una casa en conjunto cerrado
    * @param numeroBanos Parametro que define el numero de banos
    * que tiene una casa en conjunto cerrado
    * @param numeroPisos Parametro que define el numero de pisos
    * que tiene una casa en conjunto cerrado
    * @param valorAdministracion Parametro que define el valor de
    * administracion para una casa en conjunto cerrado
    * @param tienePiscina Parametro que define si una casa en conjunto
    * cerrado tiene o no piscina
    * @param tieneCamposDeportivos Parametro que define si una casa
    * en conjunto cerrado tiene o no campos deportivos
    */
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, 
    String direccion, int numeroHabitaciones, int numeroBanos, int
    numeroPisos, int valorAdministracion, boolean tienePiscina, boolean
    tieneCamposDeportivos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBanos, numeroPisos);
    this.valorAdministracion = valorAdministracion;
    this.tienePiscina = tienePiscina;
    this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    /**
    * Metodo que muestra en pantalla los datos de una casa en conjunto
    * cerrado
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println("Valor de la administracion = " +
    valorAdministracion);
    System.out.println("Tiene piscina? = " + tienePiscina);
    System.out.println("Tiene campos deportivos? = " +
    tieneCamposDeportivos);
    System.out.println();
    }
    }
    class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por area de una casa 
    independiente
    protected static double valorArea = 3000000;
    /**
    * Constructor de la clase CasaIndependiente
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de una casa independiente
    * @param area Parametro que define el area de una casa independiente
    * @param direccion Parametro que define la direccion donde se
    * encuentra localizada una casa independiente
    * @param numeroHabitaciones Parametro que define el numero de
    * habitaciones que tiene una casa independiente
    * @param numeroBanos Parametro que define el numero de banos
    * que tiene una casa independiente
    * @param numeroPisos Parametro que define el numero de pisos
    * que tiene una casa independiente
    */
    public CasaIndependiente(int identificadorInmobiliario, int area, 
    String direccion, int numeroHabitaciones, int numeroBanos, int
    numeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBanos, numeroPisos);
    }
    /**
    * Metodo que muestra en pantalla los datos de una casa independiente
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println();
    }
    }
    class Local extends Inmueble {
    // Tipo de inmueble especificado como un valor enumerado
    enum Tipo {INTERNO, CALLE}
    // Atributo que identifica el tipo de inmueble
    protected Tipo tipoLocal;
    /**
    * Constructor de la clase Local
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de un local
    * @param area Parametro que define el area de un local
    * @param direccion Parametro que define la direccion donde se
    * encuentra localizado un local
    * @param tipoLocal Parametro que define el tipo de local (interno o
    * que da a la calle)
    */
    public Local(int identificadorInmobiliario, int area, String
    direccion, Tipo tipoLocal) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion);
    this.tipoLocal = tipoLocal;
    }
    /**
    * Metodo que muestra en pantalla los datos de un local
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println("Tipo de local = " + tipoLocal);
    }
    }
    class Oficina extends Local {
    // Atributo que identifica el valor por area de una oficina
    protected static double valorArea = 3500000;
    // Atributo que identifica si una oficina pertenece o no al gobierno
    protected boolean esGobierno;
    /**
    * Constructor de la clase Oficina
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de una oficina
    * @param area Parametro que define el area de una oficina
    * @param direccion Parametro que define la direccion donde se
    * encuentra localizada una oficina
    * @param tipoLocal Parametro que define el tipo de una oficina
    * (interna o que da a la calle)
    * @param esGobierno Parametro que define un valor booleano para
    * determinar si la oficina es del gobierno o no
    */
    public Oficina(int identificadorInmobiliario, int area, String
    direccion, Tipo tipoLocal, boolean esGobierno) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, tipoLocal);
    this.esGobierno = esGobierno;
    }
    /**
    * Metodo que muestra en pantalla los datos de una oficina
    */
    void imprimir() {
    super.imprimir(); // Invoca al metodo imprimir de la clase padre
    System.out.println("Es oficina gubernamental = " + esGobierno);
    System.out.println();
    }
    }
    public class Prueba {
    /**
    * Metodo main que crea dos inmuebles, calcula su precio de
    * acuerdo al area y se muestran sus datos en pantalla
    */
    public static void main(String args[]) {
    ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120, 
    "Avenida Santander 45-45", 3, 2, 200000);
    System.out.println("Datos apartamento");
    apto1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
    apto1.imprimir();
    System.out.println("Datos apartaestudio");
    Apartaestudio aptestudio1 = new Apartaestudio(12354, 50, "Avenida 
    Caracas 30-15", 1, 1);
    aptestudio1.calcularPrecioVenta(Apartaestudio.valorArea);
    aptestudio1.imprimir();
    }
    }
    