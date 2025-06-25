package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema4_PorHoras extends Problema4_TrabajadorBase {
    private int horasTrabajadas;
    private double tarifaNormal;
    private double tarifaExtra;

    public Problema4_PorHoras(String nombre, String direccion, String dni, Problema4_Jefe jefe,
                              double tarifaNormal, double tarifaExtra) {
        super(nombre, direccion, dni, jefe);
        this.tarifaNormal = tarifaNormal;
        this.tarifaExtra = tarifaExtra;
    }

    public void registrarHoras(int horas) {
        this.horasTrabajadas = horas;
    }

    public double calcularSalario() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaNormal;
        } else {
            int horasExtra = horasTrabajadas - 40;
            return (40 * tarifaNormal) + (horasExtra * tarifaExtra);
        }
    }
}

