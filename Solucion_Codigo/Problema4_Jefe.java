package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema4_Jefe extends Problema4_TrabajadorBase {
    private double salarioFijo;

    public Problema4_Jefe(String nombre, String direccion, String dni, double salarioFijo) {
        super(nombre, direccion, dni, null);
        this.salarioFijo = salarioFijo;
    }

    public double calcularSalario() {
        return salarioFijo;
    }
}

