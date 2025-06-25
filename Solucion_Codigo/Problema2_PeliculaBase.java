package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema2_PeliculaBase {
    private String titulo;
    private String autor;
    private int anioEdicion;
    private String idioma;

    public Problema2_PeliculaBase(String titulo, String autor, int anioEdicion, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public double calcularPrecioAlquiler() {
        return 5.0;
    }

    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | Año: " + anioEdicion + " | Idioma: " + idioma;
    }
}
