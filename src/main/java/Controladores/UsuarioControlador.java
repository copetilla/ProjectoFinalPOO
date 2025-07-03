/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import LogicaNegocio.Usuario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gabriel
 */
public class UsuarioControlador {
    private final List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }
}
