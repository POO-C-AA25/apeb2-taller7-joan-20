package apeb2-taller7-joan-20.Solucion_Codigo;

import java.util.ArrayList;
import java.util.List;

public class Problema1_Parrafo extends Problema1_ComponenteBase {
    private List<Problema1_Sentencia> sentencias = new ArrayList<>();

    public Problema1_Parrafo() {
        super("Parrafo");
    }

    public void agregarSentencia(Problema1_Sentencia sentencia) {
        sentencias.add(sentencia);
    }

    public List<Problema1_Sentencia> getSentencias() {
        return sentencias;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Problema1_Sentencia sentencia : sentencias) {
            sb.append(sentencia.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}
