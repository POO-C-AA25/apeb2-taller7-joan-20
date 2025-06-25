package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema6_CuentaBase {
    protected String numeroCuenta;
    protected String nombreCliente;
    protected double balance;

    public Problema6_CuentaBase(String numeroCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.balance = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getBalance() {
        return balance;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && balance >= cantidad) {
            balance -= cantidad;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Cuenta: " + numeroCuenta + " | Cliente: " + nombreCliente + " | Balance: $" + String.format("%.2f", balance);
    }
}

