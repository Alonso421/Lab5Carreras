public class GranTurismo extends CocheDeCarreras {
    private int pesoExtraLastre;

    public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        System.out.println("Vehiculo gran turismo");
        System.out.println("¿El piloto gestiona bien la conducción?");
        System.out.println("(Peso lastre óptimo < 2000)");
        if(pesoExtraLastre<2000){
            System.out.println("El piloto gestiona bien la conducción");
        } else {
            System.out.println("El piloto no gestiona bien la conducción");
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Peso extra lastre: "+pesoExtraLastre);
    }
}
