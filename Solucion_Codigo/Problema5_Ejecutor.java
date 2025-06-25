package apeb2-taller7-joan-20.Solucion_Codigo;

import java.util.*;

public class Problema5_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Problema5_Zona> zonas = new HashMap<>();
        List<Problema5_EntradaBase> entradas = new ArrayList<>();

        zonas.put("Principal", new Problema5_Zona("Principal", 200, 25.0, 17.5));
        zonas.put("PalcoB", new Problema5_Zona("PalcoB", 40, 70.0, 40.0));
        zonas.put("Central", new Problema5_Zona("Central", 400, 20.0, 14.0));
        zonas.put("Lateral", new Problema5_Zona("Lateral", 100, 15.5, 10.0));

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Vender entrada");
            System.out.println("2. Consultar entrada");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre de la zona: ");
                String zonaNombre = sc.nextLine();
                Problema5_Zona zona = zonas.get(zonaNombre);

                if (zona == null) {
                    System.out.println("Zona no encontrada.");
                    continue;
                }

                if (!zona.hayDisponibilidad()) {
                    System.out.println("Zona completa.");
                    continue;
                }

                System.out.print("Nombre del comprador: ");
                String comprador = sc.nextLine();

                System.out.print("Tipo de entrada (normal / reducida / abonado): ");
                String tipo = sc.nextLine().toLowerCase();

                Problema5_EntradaBase entrada = null;

                switch (tipo) {
                    case "normal":
                        entrada = new Problema5_EntradaNormal(zona, comprador);
                        break;
                    case "reducida":
                        entrada = new Problema5_EntradaReducida(zona, comprador);
                        break;
                    case "abonado":
                        entrada = new Problema5_EntradaAbonado(zona, comprador);
                        break;
                    default:
                        System.out.println("Tipo no válido.");
                        continue;
                }

                entradas.add(entrada);
                System.out.println("Entrada generada: ID #" + entrada.getId() + " | Precio: $" + entrada.getPrecio());

            } else if (opcion == 2) {
                System.out.print("ID de la entrada: ");
                int id = sc.nextInt();
                boolean encontrado = false;

                for (Problema5_EntradaBase e : entradas) {
                    if (e.getId() == id) {
                        System.out.println(e.toString());
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Entrada no encontrada.");
                }
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}

