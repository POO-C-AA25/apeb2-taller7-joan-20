package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema6_CuentaPlatino extends Problema6_CuentaBase {
    private final double tasaInteres = 0.10;

    public Problema6_CuentaPlatino(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0) {
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
