package platzi.play;

import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula reyLeon = new Pelicula("El Rey LeÃ³n", 135, "Animada");
        Pelicula harryPotter = new Pelicula("Harry Potter", 200, "FantasÃ­a");

        reyLeon = harryPotter;

        reyLeon.titulo = "El Hobbit";

        System.out.println("reyLeon: " + reyLeon.titulo);
        System.out.println("harryPotter: " + harryPotter.titulo);
    }
}