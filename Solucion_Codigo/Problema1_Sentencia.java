package apeb2-taller7-joan-20.Solucion_Codigo;

import java.util.ArrayList;
import java.util.List;

public class Problema1_Sentencia {
    private List<Problema1_Palabra> palabras = new ArrayList<>();

    public void agregarPalabra(Problema1_Palabra palabra) {
        palabras.add(palabra);
    }

    public List<Problema1_Palabra> getPalabras() {
        return palabras;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Problema1_Palabra palabra : palabras) {
            sb.append(palabra.getTexto()).append(" ");
        }
        return sb.toString().trim() + ".";
    }
}

