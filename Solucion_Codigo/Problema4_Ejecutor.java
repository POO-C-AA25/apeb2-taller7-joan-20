package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema4_Ejecutor {
    public static void main(String[] args) {
        Problema4_Jefe jefeGeneral = new Problema4_Jefe("Laura Mendoza", "Av. Central", "01020304", 3500.00);

        Problema4_FijoMensual emp1 = new Problema4_FijoMensual("Carlos Pérez", "Calle Falsa 123", "12345678", jefeGeneral, 1500.00);

        Problema4_Comisionista emp2 = new Problema4_Comisionista("Ana Torres", "Calle Larga", "87654321", jefeGeneral, 0.10);
        emp2.registrarVentas(12000.00);

        Problema4_PorHoras emp3 = new Problema4_PorHoras("Luis García", "Barrio Sur", "13572468", jefeGeneral, 10.0, 15.0);
        emp3.registrarHoras(50);

        Problema4_TrabajadorBase[] empleados = { jefeGeneral, emp1, emp2, emp3 };

        for (Problema4_TrabajadorBase t : empleados) {
            System.out.println(t.toString());
        }
    }
}

