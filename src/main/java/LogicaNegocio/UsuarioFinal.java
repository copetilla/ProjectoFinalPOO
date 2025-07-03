package LogicaNegocio;

import java.util.ArrayList;
import java.util.List;

public class UsuarioFinal extends Usuario {
    
    // Atributos adicionales
    private double saldo;
    private List<Cancion> cancionesCompradas;
    private List<ListaReproduccion> listasReproduccion;
    private List<Cancion> colaReproduccion;

    // Constructor
    public UsuarioFinal(Usuario u) {
        super(u.getNombreCompleto(), u.getFechaNacimiento(), u.getNacionalidad(),
          u.getIdentificacion(), u.getAvatar(), u.getCorreo(), u.getNombreUsuario(), u.getContrasena());
        this.saldo = 0;
        this.cancionesCompradas = new ArrayList<>();
        this.listasReproduccion = new ArrayList<>();
        this.colaReproduccion = new ArrayList<>();
    }

    // Métodos
    public void recargarSaldo(double monto) {
        this.saldo += monto;
    }

    public void comprarCancion() {
    }

    public void calificarCancion() {
    }

    public void escuchaPreview() {
    }

    public void reproducirCancion() {
        
    }

    public void agregarACola() {
    }

    // Getters y Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Cancion> getCancionesCompradas() {
        return cancionesCompradas;
    }

    public void setCancionesCompradas(List<Cancion> cancionesCompradas) {
        this.cancionesCompradas = cancionesCompradas;
    }

    public List<ListaReproduccion> getListasReproduccion() {
        return listasReproduccion;
    }

    public void setListasReproduccion(List<ListaReproduccion> listasReproduccion) {
        this.listasReproduccion = listasReproduccion;
    }

    public List<Cancion> getColaReproduccion() {
        return colaReproduccion;
    }

    public void setColaReproduccion(List<Cancion> colaReproduccion) {
        this.colaReproduccion = colaReproduccion;
    }
    
    // toString()

    @Override
    public String toString() {
        return super.toString() + "\nSaldo: $" + saldo;
    }
}
