import dominio.Libro;
import service.Biblioteca;

import java.util.List;

public class AppBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca ();
        Libro libroARegistrar = new Libro("Rayuela", "Julio Cortazar", 1983);
        libroARegistrar.setCodigo("A001");
        biblioteca.registrarLibro (libroARegistrar);
        Libro libroARegistrar2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        biblioteca.registrarLibro (libroARegistrar2);
        biblioteca.etiquetarLibros();

        List <Libro> buscarLibro = biblioteca.buscarLibro("Rayuela");
        System.out.println("Los libros encontrados son: " + buscarLibro.size());

        List <Libro> librosNoEncontrados = biblioteca.buscarLibro("Rayuelas");
        System.out.println("Los libros encontrados son: " + librosNoEncontrados.size());

        biblioteca.imprimirLibros();


    }
}
