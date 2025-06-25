package apeb2-taller7-joan-20.Solucion_Codigo;

public class Problema2_Ejecutor {
    public static void main(String[] args) {
        Problema2_PeliculaBase[] peliculas = new Problema2_PeliculaBase[4];

        peliculas[0] = new Problema2_DVD(
                "Matrix", "Wachowski", 1999,
                new String[]{"Inglés", "Español", "Francés"},
                4.7
        );

        peliculas[1] = new Problema2_VHS(
                "Jurassic Park", "Spielberg", 1993,
                "Inglés",
                "Magneto HQ"
        );

        peliculas[2] = new Problema2_DVD(
                "Interstellar", "Christopher Nolan", 2014,
                new String[]{"Inglés", "Alemán"},
                8.5
        );

        peliculas[3] = new Problema2_VHS(
                "Titanic", "James Cameron", 1997,
                "Español",
                "Cinta Lenta"
        );

        for (Problema2_PeliculaBase pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
}

