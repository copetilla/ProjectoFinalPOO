/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import LogicaNegocio.Usuario;
import javax.swing.*;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author Gabriel
 */
public class UsuarioVista {
    public Usuario pedirDatosUsuario() {
        String nombreCompleto = JOptionPane.showInputDialog("Nombre completo:");
        String fechaTexto = JOptionPane.showInputDialog("Fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(fechaTexto);

        String nacionalidad = JOptionPane.showInputDialog("Nacionalidad:");
        String identificacion = JOptionPane.showInputDialog("Identificación:");
        String avatar = JOptionPane.showInputDialog("Ruta del avatar (opcional):");
        String correo = JOptionPane.showInputDialog("Correo electrónico:");
        String nombreUsuario = JOptionPane.showInputDialog("Nombre de usuario:");
        String contrasena = JOptionPane.showInputDialog("Contraseña:");

        return new Usuario(nombreCompleto, fechaNacimiento, nacionalidad,
                identificacion, avatar, correo, nombreUsuario, contrasena);
    }

    public void mostrarUsuarios(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder("Usuarios registrados:\n\n");
        for (Usuario u : usuarios) {
            sb.append(u.toString()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    public String pedirNombreUsuario() {
        return JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
    }
}
