package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema1_Figura extends Problema1_ComponenteBase {
    private String descripcion;

    public Problema1_Figura(String descripcion) {
        super("Figura");
        this.descripcion = descripcion;
    }

    public String toString() {
        return "[Figura: " + descripcion + "]";
    }
}
