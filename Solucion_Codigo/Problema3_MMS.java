package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema3_MMS extends Problema3_MensajeBase {
    private String nombreImagen;

    public Problema3_MMS(Problema3_Movil remitente, Problema3_Movil destinatario, String nombreImagen) {
        super(remitente, destinatario);
        this.nombreImagen = nombreImagen;
    }

    public void enviarMensaje() {
        super.enviarMensaje();
        System.out.println("Enviando imagen: " + nombreImagen);
    }

    public void visualizarMensaje() {
        super.visualizarMensaje();
        System.out.println("Tipo: MMS");
        System.out.println("Imagen: " + nombreImagen);
    }
}

