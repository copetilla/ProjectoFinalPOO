/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import LogicaNegocio.ListaReproduccion;
import LogicaNegocio.Cancion;

import javax.swing.*;
import java.util.List;
/**
 *
 * @author Gabriel
 */
public class ListaReproduccionVista {
    public ListaReproduccion pedirDatosLista() {
        String nombre = JOptionPane.showInputDialog("Nombre de la lista de reproducción:");
        return new ListaReproduccion(nombre);
    }

    public void mostrarListas(List<ListaReproduccion> listas) {
        if (listas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay listas de reproducción registradas.");
            return;
        }

        StringBuilder sb = new StringBuilder("Listas registradas:\n\n");
        for (ListaReproduccion lista : listas) {
            sb.append(lista.getNombre()).append(" - ")
              .append(lista.getCanciones().size()).append(" canciones\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void mostrarCancionesEnLista(ListaReproduccion lista) {
        List<Cancion> canciones = lista.getCanciones();
        if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Esta lista no tiene canciones.");
            return;
        }

        StringBuilder sb = new StringBuilder("Canciones en la lista \"" + lista.getNombre() + "\":\n\n");
        for (Cancion c : canciones) {
            sb.append(c.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public String pedirNombreListaParaBuscar() {
        return JOptionPane.showInputDialog("Ingrese el nombre de la lista de reproducción:");
    }
}
