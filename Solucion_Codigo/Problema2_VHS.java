package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema2_VHS extends Problema2_PeliculaBase {
    private String tipoCinta;

    public Problema2_VHS(String titulo, String autor, int anioEdicion, String idioma, String tipoCinta) {
        super(titulo, autor, anioEdicion, idioma);
        this.tipoCinta = tipoCinta;
    }

    public String getTipoCinta() {
        return tipoCinta;
    }

    public String toString() {
        return "[VHS] " + super.toString() + " | Cinta: " + tipoCinta + " | Precio: $" + calcularPrecioAlquiler();
    }
}
