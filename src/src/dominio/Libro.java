package dominio;

import java.util.Objects;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String codigo;

    public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro (String codigo){
        this.codigo = codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return titulo + "/" + autor + "/" + anioPublicacion + "/" + codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anioPublicacion == libro.anioPublicacion &&
                titulo.equals(libro.titulo) &&
                autor.equals(libro.autor) &&
                codigo.equals(libro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anioPublicacion, codigo);
    }
}
