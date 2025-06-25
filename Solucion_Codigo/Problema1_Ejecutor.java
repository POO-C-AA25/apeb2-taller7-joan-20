package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema1_Ejecutor {
    public static void main(String[] args) {
        Problema1_Palabra p1 = new Problema1_Palabra("Java");
        Problema1_Palabra p2 = new Problema1_Palabra("es");
        Problema1_Palabra p3 = new Problema1_Palabra("orientado");
        Problema1_Palabra p4 = new Problema1_Palabra("a");
        Problema1_Palabra p5 = new Problema1_Palabra("objetos");

        Problema1_Sentencia s1 = new Problema1_Sentencia();
        s1.agregarPalabra(p1);
        s1.agregarPalabra(p2);
        s1.agregarPalabra(p3);
        s1.agregarPalabra(p4);
        s1.agregarPalabra(p5);

        Problema1_Parrafo parrafo = new Problema1_Parrafo();
        parrafo.agregarSentencia(s1);

        Problema1_Figura figura = new Problema1_Figura("Diagrama de Clases UML");

        Problema1_Seccion seccion = new Problema1_Seccion("Programación");
        seccion.agregarComponente(parrafo);
        seccion.agregarComponente(figura);

        Problema1_Capitulo capitulo = new Problema1_Capitulo("Capítulo 1 - Introducción");
        capitulo.agregarSeccion(seccion);

        System.out.println(capitulo.toString());
    }
}
