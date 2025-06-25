package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema4_FijoMensual extends Problema4_TrabajadorBase {
    private double salarioMensual;

    public Problema4_FijoMensual(String nombre, String direccion, String dni, Problema4_Jefe jefe, double salarioMensual) {
        super(nombre, direccion, dni, jefe);
        this.salarioMensual = salarioMensual;
    }

    public double calcularSalario() {
        return salarioMensual;
    }
}

