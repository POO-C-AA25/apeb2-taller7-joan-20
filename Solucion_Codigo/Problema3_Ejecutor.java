package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema3_Ejecutor {
    public static void main(String[] args) {
        Problema3_Movil movil1 = new Problema3_Movil("0991234567", "Carlos");
        Problema3_Movil movil2 = new Problema3_Movil("0987654321", "Lucía");
        Problema3_Movil movil3 = new Problema3_Movil("0971112233");

        Problema3_SMS sms1 = new Problema3_SMS(movil1, movil2, "Hola Lucía, ¿cómo estás?");
        Problema3_SMS sms2 = new Problema3_SMS(movil2, movil1, "Todo bien, ¿y tú?");
        Problema3_MMS mms1 = new Problema3_MMS(movil1, movil3, "foto_vacaciones.png");

        System.out.println("--- Envío de Mensajes ---");
        sms1.enviarMensaje();
        sms2.enviarMensaje();
        mms1.enviarMensaje();

        System.out.println("\n--- Visualización de Mensajes ---");
        sms1.visualizarMensaje();
        System.out.println();
        sms2.visualizarMensaje();
        System.out.println();
        mms1.visualizarMensaje();
    }
}
