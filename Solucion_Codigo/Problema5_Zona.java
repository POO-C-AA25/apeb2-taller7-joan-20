package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema5_Zona {
    private String nombre;
    private int capacidadTotal;
    private double precioNormal;
    private double precioAbonado;
    private int entradasVendidas;

    public Problema5_Zona(String nombre, int capacidadTotal, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.capacidadTotal = capacidadTotal;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
        this.entradasVendidas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public boolean hayDisponibilidad() {
        return entradasVendidas < capacidadTotal;
    }

    public void venderEntrada() {
        entradasVendidas++;
    }

    public String toString() {
        return nombre + " - Disponibles: " + (capacidadTotal - entradasVendidas);
    }
}
