package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema3_SMS extends Problema3_MensajeBase {
    private String contenidoTexto;

    public Problema3_SMS(Problema3_Movil remitente, Problema3_Movil destinatario, String contenidoTexto) {
        super(remitente, destinatario);
        this.contenidoTexto = contenidoTexto;
    }

    public void enviarMensaje() {
        super.enviarMensaje();
        System.out.println("Contenido del SMS: " + contenidoTexto);
    }

    public void visualizarMensaje() {
        super.visualizarMensaje();
        System.out.println("Tipo: SMS");
        System.out.println("Texto: " + contenidoTexto);
    }
}

