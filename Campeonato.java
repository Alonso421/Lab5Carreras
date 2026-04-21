import java.util.Scanner;
import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {
        ArrayList<CocheDeCarreras> coches = new ArrayList<>();

        coches.add(new PrototipoLM("Fernando", "Alonso", 363, false));
        coches.add(new PrototipoLM("Rayo", "McQueen", 362, true));
        coches.add(new GranTurismo("Franchesco", "Virgolinni", 361, 1900));
        coches.add(new GranTurismo("Jackson", "Storm", 360, 2100));
        for (CocheDeCarreras coche : coches){
            coche.competir();
            coche.mostrarDatos();
        }

    }
}