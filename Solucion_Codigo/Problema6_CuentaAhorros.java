package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema6_CuentaAhorros extends Problema6_CuentaBase {
    private double tasaInteres;

    public Problema6_CuentaAhorros(String numeroCuenta, String nombreCliente, double tasaInteres) {
        super(numeroCuenta, nombreCliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && balance >= cantidad) {
            balance -= cantidad;
            return true;
        }
        return false;
    }

    public void aplicarInteresMensual() {
        if (balance > 0) {
            balance += balance * tasaInteres;
        }
    }
}
