package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema3_MensajeBase {
    protected Problema3_Movil remitente;
    protected Problema3_Movil destinatario;

    public Problema3_MensajeBase(Problema3_Movil remitente, Problema3_Movil destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public void enviarMensaje() {
        System.out.println("Mensaje enviado de " + remitente + " a " + destinatario);
    }

    public void visualizarMensaje() {
        System.out.println("Mensaje de " + remitente + " para " + destinatario);
    }
}
