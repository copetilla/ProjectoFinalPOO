/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author Gabriel
 */

import Controladores.UsuarioFinalControlador;
import LogicaNegocio.Cancion;

import javax.swing.*;

public class UsuarioFinalVista {
     private final UsuarioFinalControlador controlador;

    public UsuarioFinalVista(UsuarioFinalControlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        String[] opciones = {
                "Ver saldo",
                "Recargar saldo",
                "Ver canciones compradas",
                "Ver cola de reproducción",
                "Salir"
        };

        boolean continuar = true;

        while (continuar) {
            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción:",
                    "Menú Usuario Final",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 0: // Ver saldo
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + controlador.obtenerSaldo());
                    break;

                case 1: // Recargar saldo
                    String input = JOptionPane.showInputDialog("Ingrese monto a recargar:");
                    if (input != null) {
                        try {
                            double monto = Double.parseDouble(input);
                            controlador.recargarSaldo(monto);
                            JOptionPane.showMessageDialog(null, "Saldo recargado exitosamente.");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Monto inválido.");
                        }
                    }
                    break;

                case 2: // Ver canciones compradas
                    StringBuilder canciones = new StringBuilder("Canciones compradas:\n");
                    for (Cancion c : controlador.obtenerCancionesCompradas()) {
                        canciones.append("- ").append(c.getNombre()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, canciones.toString());
                    break;

                case 3: // Ver cola de reproducción
                    StringBuilder cola = new StringBuilder("Cola de reproducción:\n");
                    for (Cancion c : controlador.obtenerColaReproduccion()) {
                        cola.append("- ").append(c.getNombre()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, cola.toString());
                    break;

                default: // Salir o cerrar ventana
                    continuar = false;
                    break;
            }
        }
    }
}
