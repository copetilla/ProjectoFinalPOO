/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;


import LogicaNegocio.Cancion;
import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class CancionVista {
    public Cancion pedirDatosCancion() {
        String nombre = JOptionPane.showInputDialog("Nombre de la canción:");
        String genero = JOptionPane.showInputDialog("Género:");
        String artista = JOptionPane.showInputDialog("Artista:");
        String compositor = JOptionPane.showInputDialog("Compositor:");
        String album = JOptionPane.showInputDialog("Álbum:");
        String fechaTexto = JOptionPane.showInputDialog("Fecha de lanzamiento (YYYY-MM-DD):");
        LocalDate fecha = LocalDate.parse(fechaTexto);
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio:"));

        return new Cancion(nombre, genero, artista, compositor, fecha, album, precio);
    }

    public void mostrarCanciones(List<Cancion> canciones) {
        if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay canciones registradas.");
            return;
        }

        StringBuilder sb = new StringBuilder("Canciones registradas:\n\n");
        for (Cancion c : canciones) {
            sb.append(c).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
