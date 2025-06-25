package apeb2-taller7-joan-20.Solucion_Codigo;

import java.util.ArrayList;
import java.util.List;

public class Problema1_Seccion {
    private String titulo;
    private List<Problema1_ComponenteBase> componentes = new ArrayList<>();

    public Problema1_Seccion(String titulo) {
        this.titulo = titulo;
    }

    public void agregarComponente(Problema1_ComponenteBase componente) {
        componentes.add(componente);
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Problema1_ComponenteBase> getComponentes() {
        return componentes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Sección: " + titulo + "\n");
        for (Problema1_ComponenteBase componente : componentes) {
            sb.append(componente.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}

