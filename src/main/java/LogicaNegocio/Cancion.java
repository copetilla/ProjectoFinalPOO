/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Cancion {

    //Atributos
    private String nombre;
    private String artista;
    private String genero;
    private String album;
    private String compositor;
    private LocalDate fechaLanzamiento;
    private double precio;
    private final List<Integer> calificaciones;
    private int vecesCompradas;
    private int vecesIncluidaEnListas;

    //Constructor
    public Cancion(String nombre, String genero, String artista, String compositor, LocalDate fechaLanzamiento, String album, double precio) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
        this.calificaciones = new ArrayList<>();
        this.vecesCompradas = 0;
        this.vecesIncluidaEnListas = 0;
    }

    //Metodos
    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public boolean agregarCalificacion(int calificacion) {
        if (calificacion >= 1 && calificacion <= 10) {
            this.calificaciones.add(calificacion);
            return true;
        } else {
            return false;
        }
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String titulo) {
        this.nombre = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVecesCompradas() {
        return vecesCompradas;
    }

    public void setVecesCompradas() {
        this.vecesCompradas++;
    }

    public int getVecesIncluidaEnListas() {
        return vecesIncluidaEnListas;
    }

    public void setVecesIncluidaEnListas() {
        this.vecesIncluidaEnListas++;
    }

    // toString
    @Override
    public String toString() {
        return "Título: " + nombre + "\n"
                + "Artista: " + artista + "\n"
                + "Género: " + genero + "\n"
                + "Álbum: " + album + "\n"
                + "Compositor: " + compositor + "\n"
                + "Fecha de lanzamiento: " + fechaLanzamiento + "\n"
                + "Precio: $" + precio + "\n";
    }

}
