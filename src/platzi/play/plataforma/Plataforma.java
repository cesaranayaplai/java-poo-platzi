package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

    // Atributos
    private String nombre;
    private List<Pelicula> contenido;

    //Constructor
    public Plataforma (String nombre){
        this.nombre = nombre;
        this.contenido = new ArrayList<>(); // Inicializar una lista // Agregación
    }

    //Metodos
    // Metodo Agregar
    public void agregar(Pelicula elemento){ // void no retorna nada
        this.contenido.add(elemento);
    }

    public void mostrarTitulos(){
        for (Pelicula pelicula : contenido) {
            System.out.println(pelicula.getTitulo());
        }
    }

    // Metodo Eliminar
    public void elimiar(Pelicula elemento){
        this.contenido.remove(elemento);
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Pelicula> getContenido() {
        return contenido;
    }
}
