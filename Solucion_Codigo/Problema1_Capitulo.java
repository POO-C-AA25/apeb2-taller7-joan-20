package apeb2-taller7-joan-20.Solucion_Codigo;

import java.util.ArrayList;
import java.util.List;

public class Problema1_Capitulo {
    private String titulo;
    private List<Problema1_Seccion> secciones = new ArrayList<>();

    public Problema1_Capitulo(String titulo) {
        this.titulo = titulo;
    }

    public void agregarSeccion(Problema1_Seccion seccion) {
        secciones.add(seccion);
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Problema1_Seccion> getSecciones() {
        return secciones;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Capítulo: " + titulo + "\n");
        for (Problema1_Seccion seccion : secciones) {
            sb.append(seccion.toString()).append("\n\n");
        }
        return sb.toString().trim();
    }
}

//
