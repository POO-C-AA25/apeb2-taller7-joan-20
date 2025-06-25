package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema3_Movil {
    private String numero;
    private String nombre;

    public Problema3_Movil(String numero) {
        this.numero = numero;
    }

    public Problema3_Movil(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre != null ? nombre : "Desconocido";
    }

    public String toString() {
        return getNombre() + " (" + numero + ")";
    }
}
