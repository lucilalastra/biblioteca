package service;

import dominio.Libro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private static int consecutivo = 0;
    private List <Libro> libros;

    public Biblioteca (){
        this.libros = new ArrayList<Libro>();

    }

    public void registrarLibro (Libro libro) {
        libros.add(libro);

    }

    public void etiquetarLibros (){
        for (Libro libroAEtiquetar : libros){
            if (libroAEtiquetar.getCodigo() == null){
                libroAEtiquetar.setCodigo(libroAEtiquetar.getTitulo() + "/" + libroAEtiquetar.getAnioPublicacion() +
                        "/" + consecutivo);
                consecutivo++;
            }
        }
    }

    public List <Libro> buscarLibro (String titulo){
        List <Libro> librosEncontrados = new ArrayList<>();
        for (Libro libroABuscar : libros){
            if (libroABuscar.getTitulo().equals(titulo)){
                librosEncontrados.add(libroABuscar);
            }
        }
        return librosEncontrados;
    }

    public void imprimirLibros (){
        for (Libro libroRegistrado : libros){
            System.out.println(libroRegistrado.toString());
        }

    }


}
