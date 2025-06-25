package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema5_EntradaAbonado extends Problema5_EntradaBase {
    public Problema5_EntradaAbonado(Problema5_Zona zona, String nombreComprador) {
        super(zona, nombreComprador);
        this.precio = zona.getPrecioAbonado();
    }
}

