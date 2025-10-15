package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;


public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY 🍿";
    public static final String VERSION = "1.0.0";

    // Declaracion de constantes para menu
    public static final int AGREGAR = 1;
    public static final int MOSTRAR_TODO = 2;
    public static final int BUSCAR_POR_TITULO = 3;
    public static final int ELIMINAR = 4;
    public static final int SALIR = 5;

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v" + VERSION);


        // Menu
        while (true){
            int opcionElegida = ScannerUtils.capturarNumero("""
                    
                    Ingrese una de las siguientes opciones:
                    1. Agregar contenido
                    2. Mostrar todo
                    3. Buscar por titulo
                    4. Elimiar
                    5. Salir
                    """);

            System.out.println("Opcion elegida: " + opcionElegida);


            // Swicht Case
            switch (opcionElegida){

                case AGREGAR -> {
                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
                    String genero = ScannerUtils.capturarTexto("Genero del contenido");
                    int duracion = ScannerUtils.capturarNumero("Duracion del contenido");
                    double calificacion = ScannerUtils.capturarDecimal("Calificacion del contenido");

                    plataforma.agregar(new Pelicula(nombre, duracion, genero, calificacion));
                }

                case MOSTRAR_TODO -> plataforma.mostrarTitulos();

                case BUSCAR_POR_TITULO ->{
            }

                case ELIMINAR -> {

                }

                case SALIR -> System.exit(0);
            }



        }


//        Pelicula pelicula2 = new Pelicula("F1 The Movie", 220, "Accion");
//
//        plataforma.agregar(pelicula);
//        plataforma.agregar(pelicula2);
//        System.out.println("Numero de elementos en la plataforma: " + plataforma.getContenido().size());
//        plataforma.elimiar(pelicula2);
//
//
//        plataforma.mostrarTitulos();
//
//        Usuario usuario = new Usuario("Juan", "juan@platzi.com");
//        usuario.ver(pelicula);
    }
}