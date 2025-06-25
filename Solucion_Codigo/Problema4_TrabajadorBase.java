package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema4_TrabajadorBase {
    private String nombre;
    private String direccion;
    private String dni;
    private Problema4_Jefe jefe;

    public Problema4_TrabajadorBase(String nombre, String direccion, String dni, Problema4_Jefe jefe) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public Problema4_Jefe getJefe() {
        return jefe;
    }

    public double calcularSalario() {
        return 0.0;
    }

    public String toString() {
        return nombre + " | DNI: " + dni + " | Dirección: " + direccion +
               (jefe != null ? " | Jefe: " + jefe.getNombre() : " | Sin jefe") +
               " | Salario: $" + calcularSalario();
    }
}

