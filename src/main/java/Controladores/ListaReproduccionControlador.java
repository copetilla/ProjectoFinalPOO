/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import LogicaNegocio.ListaReproduccion;
import LogicaNegocio.Cancion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gabriel
 */
public class ListaReproduccionControlador {
    private final List<ListaReproduccion> listas = new ArrayList<>();

    public void agregarLista(ListaReproduccion lista) {
        listas.add(lista);
    }

    public List<ListaReproduccion> obtenerListas() {
        return listas;
    }

    public void agregarCancionALista(ListaReproduccion lista, Cancion cancion) {
        lista.agregarCancion(cancion);
    }

    public void eliminarCancionDeLista(ListaReproduccion lista, Cancion cancion) {
        lista.eliminarCancion(cancion);
    }
}
