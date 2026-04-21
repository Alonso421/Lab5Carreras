public class PrototipoLM extends CocheDeCarreras {
    private boolean sistemaHibrido;

    public PrototipoLM(String marca, String modelo, int velocidadMaxima, boolean sistemaHibrido) {
        super(marca, modelo, velocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }


    @Override
    public void competir() {
        System.out.println("Vehiculo PrototipoLM");
        System.out.println("Tipo de motor: ");
        if (sistemaHibrido) {
            System.out.println("Sistema hibrido");
        } else {
            System.out.println("Solo de combustión");
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("¿Es sistema hibrido? " + sistemaHibrido);
    }

}
