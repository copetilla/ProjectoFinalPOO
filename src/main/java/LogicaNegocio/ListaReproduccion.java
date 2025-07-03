package LogicaNegocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {

    // Atributos
    
    private String nombre;
    private LocalDate fechaCreacion;
    private List<Cancion> canciones;
    private double calificacion;
    
    //Constructor

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.canciones = new ArrayList<>();
        this.calificacion = 0.0;
    }
    
    //Métodos

    public void agregarCancion(Cancion nombreCancion) {
        canciones.add(nombreCancion);
    }

    public void eliminarCancion(Cancion nombreCancion) {
        canciones.remove(nombreCancion);
    }

    public double obtenerCalificacionPromedio() {
        return calificacion;
    }

    public void reproducir() {
       
    }
    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    // toString()

    @Override
    public String toString() {
        return "Lista: " + nombre + " (" + canciones.size() + " canciones)";
    }
}
