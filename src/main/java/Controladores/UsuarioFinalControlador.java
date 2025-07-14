/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author Gabriel
 */
import LogicaNegocio.Cancion;
import LogicaNegocio.UsuarioFinal;
import LogicaNegocio.ListaReproduccion;
import java.util.List;

public class UsuarioFinalControlador {

    private final UsuarioFinal usuario;

    public UsuarioFinalControlador(UsuarioFinal usuario) {
        this.usuario = usuario;
    }

    public void recargarSaldo(double monto) {
        usuario.recargarSaldo(monto);
    }

    public double obtenerSaldo() {
        return usuario.getSaldo();
    }

    public List<Cancion> obtenerCancionesCompradas() {
        return usuario.getCancionesCompradas();
    }

    public void agregarCancionComprada(Cancion cancion) {
        usuario.getCancionesCompradas().add(cancion);
    }

    public void agregarCancionACola(Cancion cancion) {
        usuario.getColaReproduccion().add(cancion);
    }

    public List<Cancion> obtenerColaReproduccion() {
        return usuario.getColaReproduccion();
    }

    public List<ListaReproduccion> obtenerListas() {
        return usuario.getListasReproduccion();
    }

    public void agregarLista(ListaReproduccion lista) {
        usuario.getListasReproduccion().add(lista);
    }

    public UsuarioFinal getUsuario() {
        return usuario;
    }
}
