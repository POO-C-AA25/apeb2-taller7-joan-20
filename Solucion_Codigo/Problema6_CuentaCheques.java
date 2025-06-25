package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema6_CuentaCheques extends Problema6_CuentaBase {

    public Problema6_CuentaCheques(String numeroCuenta, String nombreCliente) {
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
}
