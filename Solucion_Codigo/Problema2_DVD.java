package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema2_DVD extends Problema2_PeliculaBase {
    private double capacidadGB;
    private String[] idiomas;

    public Problema2_DVD(String titulo, String autor, int anioEdicion, String[] idiomas, double capacidadGB) {
        super(titulo, autor, anioEdicion, String.join(", ", idiomas));
        this.capacidadGB = capacidadGB;
        this.idiomas = idiomas;
    }

    public double getCapacidadGB() {
        return capacidadGB;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public double calcularPrecioAlquiler() {
        return super.calcularPrecioAlquiler() * 1.10;
    }

    public String toString() {
        return "[DVD] " + super.toString() + " | Capacidad: " + capacidadGB + "GB | Precio: $" + calcularPrecioAlquiler();
    }
}
