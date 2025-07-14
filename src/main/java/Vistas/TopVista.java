/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author Gabriel
 */

import Controladores.TopControlador;
import LogicaNegocio.Cancion;

import javax.swing.*;
import java.util.List;

public class TopVista {
    private final TopControlador controlador;

    public TopVista(TopControlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        String[] opciones = {
                "Top 5 - Mejor calificadas",
                "Top 5 - Más compradas",
                "Top 5 - Más incluidas en listas",
                "Salir"
        };

        boolean continuar = true;

        while (continuar) {
            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione un Top para visualizar:",
                    "Top 5 de Canciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 0:
                    mostrarCanciones(controlador.getTopMejorCalificadas(), "Top 5 Mejor Calificadas");
                    break;
                case 1:
                    mostrarCanciones(controlador.getTopMasCompradas(), "Top 5 Más Compradas");
                    break;
                case 2:
                    mostrarCanciones(controlador.getTopMasIncluidas(), "Top 5 Más Incluidas en Listas");
                    break;
                default:
                    continuar = false;
                    break;
            }
        }
    }

    private void mostrarCanciones(List<Cancion> canciones, String titulo) {
        if (canciones == null || canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay canciones en este top.", titulo, JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder mensaje = new StringBuilder();
        int i = 1;
        for (Cancion c : canciones) {
            mensaje.append(i++).append(". ").append(c.getNombre()).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
