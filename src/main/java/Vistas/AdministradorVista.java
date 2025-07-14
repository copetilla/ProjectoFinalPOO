/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author Gabriel
 */

import Controladores.AdministradorControlador;

import javax.swing.*;
        
public class AdministradorVista {
    private final AdministradorControlador controlador;

    public AdministradorVista(AdministradorControlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        String[] opciones = {
                "Subir canción",
                "Eliminar canción",
                "Editar canción",
                "Buscar canción",
                "Buscar lista",
                "Reproducir lista",
                "Salir"
        };

        boolean continuar = true;

        while (continuar) {
            int opcion = JOptionPane.showOptionDialog(null,
                    "Menú Administrador - " + controlador.getNombreUsuario(),
                    "Administrador",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 0:
                    controlador.subirCancion();
                    JOptionPane.showMessageDialog(null, "Canción subida.");
                    break;
                case 1:
                    controlador.eliminarCancion();
                    JOptionPane.showMessageDialog(null, "Canción eliminada.");
                    break;
                case 2:
                    controlador.editarCancion();
                    JOptionPane.showMessageDialog(null, "Canción editada.");
                    break;
                case 3:
                    controlador.buscarCancion();
                    JOptionPane.showMessageDialog(null, "Búsqueda completada.");
                    break;
                case 4:
                    controlador.buscarLista();
                    JOptionPane.showMessageDialog(null, "Lista encontrada.");
                    break;
                case 5:
                    controlador.reproducirLista();
                    JOptionPane.showMessageDialog(null, "Lista en reproducción.");
                    break;
                default:
                    continuar = false;
                    break;
            }
        }
    }
}
