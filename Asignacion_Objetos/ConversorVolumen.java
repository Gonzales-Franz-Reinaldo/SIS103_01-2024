public class ConversorVolumen {
    
    public int litros;

    final double FACTOR_LITROS_GALON = 4.41;
    final double FACTOR_LITROS_PINTA = 0.46;
    final double FACTOR_LITROS_BARRIL = 158.99;
    final int FACTOR_LITROS_METROS_CUBICO = 1000;
    final int FACTOR_LITROS_HECTOLITRO = 100;
    

    public ConversorVolumen(int litros) {
        this.litros = litros;
    }

    // Convertir litros a galones
    public double convertirToGalones(){
        double galones = litros / FACTOR_LITROS_GALON;
        return galones;
    }

    // Convertir litros a pintas
    public double convertirToPintas(){
        double pintas = litros / FACTOR_LITROS_PINTA;
        return pintas;
    }

    // Convertir litros a barriles
    public double convertirToBarriles(){
        double barriles = litros / FACTOR_LITROS_BARRIL;
        return barriles;
    }

    // Convertir litros a metros cubicos
    public double convertirToMetrosCubicos(){
        double metroCubico = litros / FACTOR_LITROS_METROS_CUBICO;
        return metroCubico;
    }

    // Convertir litros a hectolitros
    public double convertirToHectolitros(){
        double hectolitros = litros / FACTOR_LITROS_HECTOLITRO;
        return hectolitros;
    }

    public static void main(String[] args) {

        ConversorVolumen conversorVolumen = new ConversorVolumen(100);

        System.out.println("Litros en galones: " + conversorVolumen.convertirToGalones());
        System.out.println("Litros en pintas: " + conversorVolumen.convertirToPintas());
        System.out.println("Litros en barriles: " + conversorVolumen.convertirToBarriles());
        System.out.println("Litros en metros cubicos: " + conversorVolumen.convertirToMetrosCubicos());
        System.out.println("Litros en hectolitros: " + conversorVolumen.convertirToHectolitros());
    }
}
