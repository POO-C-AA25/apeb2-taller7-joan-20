package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema6_Ejecutor {
    public static void main(String[] args) {
        Problema6_CuentaCheques c1 = new Problema6_CuentaCheques("001", "Juan Perez");
        Problema6_CuentaAhorros c2 = new Problema6_CuentaAhorros("002", "Maria Lopez", 0.03);
        Problema6_CuentaPlatino c3 = new Problema6_CuentaPlatino("003", "Luis Gómez");

        c1.depositar(500);
        c1.retirar(600);

        c2.depositar(1000);
        c2.retirar(200);
        c2.aplicarInteresMensual();

        c3.depositar(2000);
        c3.retirar(2500);
        c3.aplicarInteresMensual();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}

