package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema5_EntradaBase {
    protected static int contador = 1;
    protected int id;
    protected Problema5_Zona zona;
    protected String nombreComprador;
    protected double precio;

    public Problema5_EntradaBase(Problema5_Zona zona, String nombreComprador) {
        this.id = contador++;
        this.zona = zona;
        this.nombreComprador = nombreComprador;
        zona.venderEntrada();
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Entrada #" + id + " | Comprador: " + nombreComprador + " | Zona: " + zona.getNombre() + " | Precio: $" + precio;
    }
}
